const express =require('express');

const app=express();


app.get('/home',(req,res)=>{
	res.send('hello get method');
})


app.post('/home',(req,res)=>{
	res.send('hello post method');
})


app.delete('/home',(req,res)=>{
	res.send('hello delete method');
})



app.all('/home',(req,res)=>{
	res.write('hello all method');
})


app.listen(3000,()=>{
	console.log('server started 3000');
})