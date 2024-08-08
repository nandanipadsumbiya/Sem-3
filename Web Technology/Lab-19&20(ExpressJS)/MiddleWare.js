const express =require('express');

const app=express();

app.use('/',(req,res,next)=>{
	next();
	console.log('msg!');
	res.send("hello world!");
})


app.listen(3000,()=>{
	console.log('server started 3000');
});