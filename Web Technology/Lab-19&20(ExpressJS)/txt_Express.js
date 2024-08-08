const express =require('express');

const app=express();
const fs=require('fs');


app.get('/',(req,res)=>{
	 const data= fs.readFile('darshan.txt',(err,data)=>{
	 		res.send(data.toString());
	 });
	 
});


app.listen(3040,()=>{
	console.log('server started 3040');
});

