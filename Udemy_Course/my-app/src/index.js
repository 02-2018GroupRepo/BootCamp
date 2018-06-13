import React from 'react';
import ReactDOM from 'react-dom';

// COMPONENTS
import Header from './components/header';


// This is ES6
const App = () =>{
	return (
		<div>
			<Header />
		</div>
	) 
}



ReactDOM.render(<App />,document.querySelector('#root'))