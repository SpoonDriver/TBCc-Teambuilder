import React, { Component } from 'react';

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
      <form onSubmit={this.submitHandler}>

        <div>
          <input type="text" name="raidName" value={raidName} onChange={this.changeHandler}></input>
        </div>
        <div>
          <input type="text" name="faction" value={faction} onChange={this.changeHandler}></input>
        </div>
        <div>
          <input type="text" name="groupLeader" value={groupLeader} onChange={this.changeHandler}></input>
        </div>
        <div>
          <input type="text" name="serverName" value={serverName} onChange={this.changeHandler}></input>
        </div>
        <div>
          <input type="text" name="region" value={region} onChange={this.changeHandler}></input>
        </div>
        <button type="submit">Sub</button>
      </form>
    )
  }
}



export default MakeGroupComponent;

