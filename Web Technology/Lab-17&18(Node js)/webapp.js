const http=require('http');
const fs=require('fs');

const server=http.createserver((req,res)=>{
    if(req.url=="/about"){
        const data=hello;
        res.end(data);
    }
    if(req.url=="/contact"){
        const data=darshan;
        res.end(data);
    }
    
});

server.listen(3000,()=>{
    console.log("server started at 3000")
});