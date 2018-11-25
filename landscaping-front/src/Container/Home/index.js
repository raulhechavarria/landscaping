import React, { Component } from 'react';

import Today from './YardsToday'
import '../../CSS/Home.css'

class Home extends Component {
    
  render() {
    return (
      <div className='home'>
            
            <Today/>
      
      </div>
    );
  }
}

export default Home;
