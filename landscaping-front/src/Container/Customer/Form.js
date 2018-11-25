
import React, { Component } from 'react'
import { Form, FormGroup, Label, Input, Button, Row, Col  } from 'reactstrap'
import axios from 'axios'
import { BootstrapTable, TableHeaderColumn } from 'react-bootstrap-table';
import Moment from 'moment';



class CustomerForm extends Component {

  constructor () {
    super()
    this.state = {
        name: '',
        lastName:  '',
        phone: '',
        yards: [],
        streetandnumber: '', 
        city:'',
        frequenceSummer:'',
        frequenceWinter:''
    }

    this.onSubmit = this.onSubmit.bind(this)
    this.handleDeletedRow = this.handleDeletedRow.bind(this)
  }

  componentDidMount () {
	 this.loadCustomer()
  }
  
  loadCustomer() {
    const { match } = this.props
    const id = match.params.id
    if (id) {
    	axios.get('/customer/' + id)
        .then((result) => {
    	  let items = result.data
      	  this.setState({
            name: items.name|| '',
            lastName: items.lastName|| '',
            phone: items.phone|| '',
            yards: items.yards|| ''
      	  })
        }) 
    }
  }

 onSubmit () {
    const { name, lastName, phone, yards } = this.state
    const { match } = this.props
    const id = match.params.id

    const obj = {
      id,
      name, 
      lastName,  
      phone, 
      yards
    }

    if (!id) {
      // create new
      axios.post('/customer', obj)
        .then(function (response) {
          alert(response.data.id)
        })
    } else {
      // upyards
      axios.put('/customer', obj)
        .then(function (response) {
          alert(response.data.id)
         
        })
    }
    this.props.history.push('/customer',this.state)  
  }



  handleDeletedRow(rowKeys) {

    var array = [...this.state.yards]; // make a separate copy of the array
    var index = array.indexOf(rowKeys)
    array.splice(index, 1);
    this.setState({yards: array});



 //   this.setState({yards: this.state.yards.filter(function(yard) { 
   //     return yard.streetandnumber !== rowKeys 
   // })});
};



  render () {
    const {name, lastName, phone,  streetandnumber, city, frequenceSummer } = this.state
  //  const { match } = this.props

    const selectRow = { mode: 'radio' /*radio or checkbox */};
    const dateFormatter = (cell, row) => Moment(row.dateDone).format('MMM Do YYYY');

  

    return (
      <div>
        <Form>
        <FormGroup>
        <Label for='name'>name</Label>
        <Input type='name' name='name' id='name' value={name} onChange={(e) => this.setState({ name: e.target.value })} />
      </FormGroup>
        <FormGroup>
        <Label for='lastName'>lastName</Label>
        <Input type='lastName' name='lastName' id='lastName' value={lastName} onChange={(e) => this.setState({ lastName: e.target.value })} />
      </FormGroup>
      <FormGroup>
        <Label for='phone'>phone</Label>
        <Input type='phone' name='phone' id='phone' value={phone} onChange={(e) => this.setState({ phone: e.target.value })} />
      </FormGroup>

      <FormGroup>
          
          <BootstrapTable  data={this.state.yards} striped={true} hover={true} deleteRow insertRow 
                    selectRow={ selectRow }   onAddRow
                    options={{
                      afterInsertRow: (newRow) => {
                        this.setState({yards: this.state.yards.concat(newRow)})
                      },
                      afterDeleteRow: this.handleDeletedRow

                    }}>
            <TableHeaderColumn dataField='streetandnumber' isKey>Address</TableHeaderColumn>
            <TableHeaderColumn dataField='city' >City</TableHeaderColumn>
            <TableHeaderColumn dataField='frequenceSummer'>Freq in Summer</TableHeaderColumn>
            <TableHeaderColumn dataField='frequenceWinter'>Freq in Winter</TableHeaderColumn>
            <TableHeaderColumn dataField='dateDone'  dataFormat={ dateFormatter } editable={ { type: 'date' } }>Last Date Cut</TableHeaderColumn>
          </BootstrapTable>
  
      </FormGroup>

          <Button color='primary' onClick={this.onSubmit}>Submit</Button>
          <Button onClick={() => this.props.history.push('/customer')}>Cancel</Button>
         
        </Form>
      </div>
    )
  }
}

export default CustomerForm
