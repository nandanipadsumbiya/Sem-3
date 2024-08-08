const express = require('express');
const bodyParser=require('body-parser');

const app=express();
app.use(bodyParser.urlencoded());
//app.use(express.json());

const student=[
    {
        id:123,
        name: 'abc',
        email:'abcshfkv@gmail.com',
        age:22
    },
    {
        id:456,
        name: 'qwe',
        email:'qweahdtb@gmail.com',
        age:23
    },
    {
        id:789,
        name: 'zxc',
        email:'zxcfhgtnb@gmail.com',
        age:24
    }
]


//get all
app.get('/student',(req,res)=>{
    res.send(student);
})

//get index
app.get('/student/:id',(req,res)=>{
    const ans=student.find((stu)=>{
        if(stu.id==req.params.id){
            return true;
        }
    });
    res.send(ans);
})

//creat
app.post('/student',(req,res)=>{
    student.push(req.body);
    res.send('student add');
})

//update
app.patch('/student/:id',(req,res)=>{
    const indextoedit=student.findIndex((stu)=>{
        if(stu.id==req.params.id){
            return true;
        }
    });
    student[indextoedit]=req.body;
    res.send('student update');
})

//delete
app.delete('/student/:id',(req,res)=>{
    const indexToDelete=student.findIndex((stu)=>{
        if(stu.id==req.params.id){
            return true;
        }
    })
    student.splice(indexToDelete,1);
    res.send('student delete');
});

//search
app.get('/student/search/:text',(req,res)=>{
    const ans=student.filter(stu=>{
        if(stu.name.indexOf(req.params.text)>-1){
            return true;
        }
    });
    res.send(ans);
})

//from - to
app.get('/student/filter/:from-:to',(req,res)=>{
    const ans=student.filter((stu)=>{
        if(stu.id>res.params.from && stu.id<req.params.to){
            return true;
        }
    });
    res.send(ans);
});

app.listen(3004,()=>{
    console.log("server satarted at 3004");
})