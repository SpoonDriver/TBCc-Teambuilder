import React, { Component } from 'react';
import './Home.css';

class MakeGroupComponent extends Component {
  constructor(props) {
    super(props)

    this.state = {
      raidName: '',
      faction: '',
      groupLeader: '',
      serverName: '',
      region: ''
    }
  }

  changeHandler = event => {
    this.setState({ [event.target.name]: event.target.value })

  }

  handleRegionChange = event => {
    this.setState({
      region: event.target.value
    })
  }

  handleFactionChange = event => {
    this.setState({
      faction: event.target.value
    })
  }

  submitHandler = event => {
    console.log(this.state)
    event.preventDefault()




    var requestOptions = {
      method: 'POST',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({
        "groupLeader": this.state.groupLeader,
        "faction": this.state.faction,
        "serverName": this.state.serverName,
        "region": this.state.region,
        "raidName": this.state.raidName
      })
    };

    fetch("http://localhost:8080/api/teamcomp/createComp", requestOptions)
      .then(response => response.text())
      .then(result => console.log(result))
      .catch(error => console.log('error', error));
  }

  render() {
    const { raidName, faction, groupLeader, serverName, region } = this.state
    return (
      <div className="container">
        <form onSubmit={this.submitHandler}>

          <div>
            <label>Raid: </label>
            <input type="text" name="raidName" value={raidName} onChange={this.changeHandler}></input>
          </div>
          <div>
            <label>Faction: </label>
            <select value={faction} onChange={this.handleFactionChange}>
              <option ></option>
              <option value="ALLIANCE">Alliance</option>
              <option value="HORDE">Horde</option>
            </select>
          </div>
          <div>
            <label>Groupleader: </label>
            <input type="text" name="groupLeader" value={groupLeader} onChange={this.changeHandler}></input>
          </div>
          <div>
            <label>Server: </label>
            <input type="text" name="serverName" value={serverName} onChange={this.changeHandler}></input>
          </div>
          <div>
            <label>Region: </label>
            <select value={region} onChange={this.handleRegionChange}>
              <option></option>
              <option value="EU">EU</option>
              <option value="NA">NA</option>
            </select>
          </div>
          <button className="btn" type="submit">Create group</button>
        </form>
      </div>
    )
  }
}



export default MakeGroupComponent;

