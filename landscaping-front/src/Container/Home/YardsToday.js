import React, { Component } from 'react'
import {Label} from 'reactstrap'
import axios from 'axios'
import Moment from 'moment';
//import '../../CSS/YardsToday.css'

class YardsToday extends Component {

    constructor () {
    super()
    this.state = {
      items: [{}],
     }
  }

  componentDidMount () {
    this.loadYardsTodays()
  }
  
  onResectDate (e, item) {
    e.preventDefault()
    if (window.confirm('Do you finish that yard: ' + item.id + '?')) {

    const { id, streetandnumber, city, frequenceSummer, frequenceWinter, customer } = item
    const dateDone = new Date()
    const obj = { id, streetandnumber, city,frequenceSummer, frequenceWinter, dateDone ,customer }

    axios.put('/yard', obj)
    .then(function (response) {
      alert(response.data.id)
     
    })
 }
  }

  loadYardsTodays() {
	    return axios.get('/yard/today') ///axios llamasat http
	      .then((result) => {
	        this.setState({items: result.data})
	      })
  }

  render () {
    const { items } = this.state
    return (
      <div className='YardsTodays'>
      <Label><h1>yard need to do today</h1></Label>
          <div className='row'>
            <div className='col-xs-2'>Address</div>
            <div className='col-xs-2'>Date</div>
            <div className='col-xs-2'>Customer</div>
            <div className='col-xs-3'>Phone</div>
            <div className='col-xs-3'>Action</div>
          </div>
          {items.map((item, i) =>
            <div className='row' key={i}>
              <div className='col-xs-2'>{item.streetandnumber}</div>
              <div className='col-xs-2'>{Moment(item.dateDone).format('MMM Do YYYY')}</div>
              <div className='col-xs-2'>{item.name}</div>
              <div className='col-xs-3'>{item.phone}</div>
              <div className='col-xs-3'><a href='/' onClick={(e) => this.onResectDate(e, item)}>Yard Done</a></div>
            </div> 
          )}
        
      </div>
    )
  }
}

export default YardsToday
