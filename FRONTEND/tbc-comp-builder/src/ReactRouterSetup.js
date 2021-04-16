import React from 'react'
import Home from './Home'
import { BrowserRouter as Router, Route, Switch } from
  'react-router-dom';
import MakeGroupComponent from './MakeGroupComponent';
import TeamComponent from './TeamComponent';

const ReactRouterSetup = () => {
  return (
    <Router>
      <Route exact path='/'>
        <Home />
      </Route>
      <Route exact path='/MakeGroup'>
        <MakeGroupComponent />
      </Route>
      <Route
  exact
  path='/Team/:id'
  component={TeamComponent}
/>
    </Router>
  )
}

export default ReactRouterSetup;