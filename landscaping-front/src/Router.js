//dependecie
import React  from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'

//componet
import App from './App'

import Home from './Container/Home'

import Customer from './Container/Customer'
import Complaint from './Container/Aboutus'
import CustomerForm from './Container/Customer/Form'
//import Login from "./Container/Login/Login"; <Route path="/login" exact component={Login} />
import Map1 from './Container/MapContainer/MapContainer'

const AppRouters = () =>
<App>
    <Switch>
     
            <Route path="/customer/edit/:id" component={CustomerForm}></Route>
            <Route path="/customer/new" component={CustomerForm}></Route>
            <Route path="/customer" component={Customer}></Route>
            <Route path="/aboutus" component={Complaint}></Route>
            <Route path="/map" component={Map1}></Route>
            <Route path="/" component={Home}></Route>
            
            
    </Switch>
</App>

export default AppRouters
