
import React, { Component } from 'react'
import { Form, FormGroup, Label, Input, Button, Row, Col  } from 'reactstrap'
import axios from 'axios'


class Complaint extends Component {

  constructor () {
    super()
    this.state = {
        description: ''
    }

    this.onSubmit = this.onSubmit.bind(this)
  }

  

 onSubmit () {
    const { description } = this.state
   
    const obj = {
        description
    }
      axios.post('/complaint', obj)
        .then(function (response) {
          alert(response.data.id)
        })
    this.props.history.push('/aboutus',this.state)  
  }


  render () {
    const {description } = this.state
  

    return (
      <div>
        <Form>
        <FormGroup>
        <Label for='name'>Description Complaint</Label>
        <Input type='text' name='description' id='description' value={description} onChange={(e) => this.setState({ description: e.target.value })} />
      </FormGroup>
       
          <Button color='primary' onClick={this.onSubmit}>Submit</Button>
         
        </Form>
      </div>
    )
  }
}

export default Complaint
