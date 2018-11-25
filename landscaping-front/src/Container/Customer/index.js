import React, { Component } from 'react'
import { Link } from 'react-router-dom'
import {FormGroup, Label, Input, Button } from 'reactstrap'
import axios from 'axios'
import '../../CSS/Customer.css'

class Customer extends Component {

    constructor () {
    super()
    this.state = {
      items: [{}],
     }
  }

  componentDidMount () {
    this.loadCustomers()
  }
/*
  onSearchstreetandnumber(e, streetandnumber){
    e.preventDefault()
    return axios.get('/customer/streetandnumber/' + streetandnumber) ///axios llamasat http
	      .then((result) => {
	        this.setState({items: result.data})
	      })
  }
  
  onSearchzipcode(e, zipcode){
    e.preventDefault()
    return axios.get('/customer/zipcode/' + zipcode) ///axios llamasat http
	      .then((result) => {
	        this.setState({items: result.data})
	      })
  }

       <FormGroup>
          <Label for='streetandnumber'>Search Address</Label>
        <Input type='streetandnumber' name='streetandnumber' id='streetandnumber' value={streetandnumber} onChange={(e) => this.setState({ streetandnumber: e.target.value })} />
        <Button color='primary' onClick={(e) => this.onSearchstreetandnumber(e, streetandnumber)}>Search</Button>
        
        <Label for='zipcode'> Search zipcode</Label>
        <Input type='zipcode' name='zipcode' id='zipcode' value={zipcode} onChange={(e) => this.setState({ zipcode: e.target.value })} />
        <Button color='primary' onClick={(e) => this.onSearchzipcode(e, zipcode)}>Search</Button>
        
      </FormGroup>

*/
  
  onDelete (e, id) {
    e.preventDefault()
    if (window.confirm('Are you sure to delete: ' + id + '?')) {
      // delete
    	axios
    	.delete('/customer/' + id)
    	.then((res) => {
    	//	alert(res.data.message)
    		this.loadCustomers();
    		//window.confirm('done')
       	this.props.history.push('/customer')
        })
 }
  }

  loadCustomers() {
	    return axios.get('/customer') ///axios llamasat http
	      .then((result) => {
	        this.setState({items: result.data})
	      })
  }

  render () {
    const { items } = this.state
    return (
      <div className='Customers'>
          <h3>List Incident <Link to='/customer/new' className='btn btn-primary'>New</Link></h3>
          <div className='row'>
            <div className='col-xs-3'>Name</div>
            <div className='col-xs-3'>Last Name</div>
            <div className='col-xs-3'>Phone</div>
            <div className='col-xs-3'>Action</div>
          </div>
          {items.map((item, i) =>
            <div className='row' key={i}>
              <div className='col-xs-3'>{item.name}</div>
              <div className='col-xs-3'>{item.lastName}</div>
              <div className='col-xs-3'>{item.phone}</div>
              <div className='col-xs-3'>
                <a href={'/customer/edit/' + item.id}>Edit</a>
                <a href='/' onClick={(e) => this.onDelete(e, item.id)}>Delete</a>
              </div>
            </div> 
          )}
        
      </div>
    )
  }
}

export default Customer
