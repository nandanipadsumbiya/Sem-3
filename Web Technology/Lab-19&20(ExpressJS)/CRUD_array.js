

const express = require('express');
const app=express();

const student=['nandani','shruti','riya','mansi','darshi'];

//crud=creat,read,upadate,delete

//get all student
app.get('/student',(req,res)=>{
    res.send(student);
});

//get index student  
app.get('/student/:index',(req,res)=>{
    //const ans=;
    res.send(student[req.params.index]);
});

//creat
app.post('/student/:name',(req,res)=>{
    student.push(req.params.name);
    res.send(student);
});

//update (patch=put)  
app.patch('/student/:index/:newname',(req,res)=>{
    student[req.params.index]=req.params.newname;
    res.send(student);
})

//delete  
app.delete('/student/:index',(req,res)=>{
    student.splice(req.params.index,1);
    res.send(student);
})

app.listen(3000,()=>{
    console.log("server satarted at 3000");
})