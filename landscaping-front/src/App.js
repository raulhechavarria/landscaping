//
import React, { Component } from 'react';
import PropTypes from 'prop-types';
//import logo from './logo.svg';
import './App.css';

//component
import Header from './Container/Header';
import Content from './Container/Content';
import Footer from './Container/Footer';
// datas
import items from './Container/Data/Menu'; 

class App extends Component {
 static propType ={
   children: PropTypes.object.isRequired
 }
  render() {
    const {children} = this.props
    return (
      <div className="App">
        <Header title="Landscaping  control frequency" items={items}/>
        <Content body={children}/>
        <Footer copyright="&copy; RHP Company Developer . please call (786)223-9429"/>
      </div>
    );
  }
}

export default App;
