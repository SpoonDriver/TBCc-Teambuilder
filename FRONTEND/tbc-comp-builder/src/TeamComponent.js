import React from 'react';
import {useParams} from "react-router-dom";

class TeamComponent extends React.Component {
     constructor(props) {

        super(props);

        this.state = {
            players: [],
            isLoaded: false
        }

    }

    componentDidMount() {
        const { id } = this.props.match.params;
        fetch(`http://localhost:8080/api/teamcomp/getPlayersInComp/${id}`)
          .then(res => res.json())
          .then(json => {
            this.setState({
              players: json,
              isLoaded: true, 
            })
          }).catch((err) => {
            console.log(err);
          });
      }

    render() {

        const { isLoaded, players } = this.state;

        if (!isLoaded)
            return <div>Loading...</div>;

        return (
            <div className="App">
                <ul>
                    {players.map(player => (
                        <li key={player.id}>
                            Ign: {player.characterName} | Role: {player.role} | Class: {player.classes}
                        </li>
                    ))}
                </ul>
            </div>
        );

    }

}
export default TeamComponent;