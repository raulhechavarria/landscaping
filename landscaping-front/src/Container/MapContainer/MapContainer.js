import React, { Component } from 'react';
import GoogleMapReact from 'google-map-react';
import {GoogleApiWrapper,Marker} from 'google-maps-react';
import axios from 'axios';
 
//const AnyReactComponent = ({ text }) => <div>{text}</div>;
 
class MapContainer extends Component {

  constructor () {
    super()
    this.state = {
      items: [{}],
     }
  }

  static defaultProps = {
    center: {
      lat: 25.859425,
      lng: -80.278936
    },
    zoom: 11
  };

  componentDidMount () {
    this.onMarkerClick()
  }

  onMarkerClick(props, marker, e){
    return axios.get('/yard/today') ///axios llamasat http
	      .then((result) => {
	        this.setState({items: result.data})
        })
        
  };

  render() {

    const triangleCoords = [
      {lat: 25.774, lng: -80.190},
      {lat: 18.466, lng: -66.118},
      {lat: 32.321, lng: -64.757},
      {lat: 25.774, lng: -80.190}
    ];
    
    return (
      // Important! Always set the container height explicitly
      <div style={{ height: '100vh', width: '100%' }}>
        <GoogleMapReact
          bootstrapURLKeys={{ 
          key: "AIzaSyDPiYZ_CRQ8ijSbYwZVwuqrmyVhcfskox4",
          language: 'us',
          region: 'us',
        }}
          defaultCenter={this.props.center}
          defaultZoom={this.props.zoom}
        >
          <Marker onClick={this.onMarkerClick}
          name={'Current location'} />
          
        </GoogleMapReact>
      </div>
    );
  }
}


export default GoogleApiWrapper({
    apiKey: ("AIzaSyDPiYZ_CRQ8ijSbYwZVwuqrmyVhcfskox4")
  })(MapContainer);