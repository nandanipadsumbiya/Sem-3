const express =require('express');

const app=express();


app.get('/home',(req,res)=>{
	res.send('hello home method');
})


app.get('/about',(req,res)=>{
	res.send('hello about method');
})


app.get('/contact',(req,res)=>{
	res.send('hello contact method');
})


app.get('/',(req,res)=>{
	res.send('hello / method');
})




// app.all('/home',(req,res)=>{
// 	res.write('hello all method');
// })


app.listen(3030,()=>{
	console.log('server started 3030');
})