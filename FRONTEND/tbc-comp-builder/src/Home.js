import React from 'react';
import { Link } from 'react-router-dom';

function Home() {
    return (
        <div className='container'>
            <h2>TeamComp Builder</h2>
            <Link to='/MakeGroup' className='btn'>
                Make group
            </Link>
        </div>
    )
}

export default Home;