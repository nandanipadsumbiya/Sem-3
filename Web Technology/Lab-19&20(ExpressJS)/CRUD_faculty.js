
const express = require('express');
const bodyParser=require('body-parser');

const app=express();
app.use(bodyParser.urlencoded());
//app.use(express.json());

const faculty=[
    {
        id:1,
        name: 'arjun sir',
        email:'arjun@gmail.com',
       
    },
    {
        id:2,
        name: 'dixita mam',
        email:'dixita@gmail.com',
       
    },
    {
        id:3,
        name: 'shruti mam',
        email:'shruti@gmail.com',
       
    }
]


//get all
app.get('/faculty',(req,res)=>{
    res.send(faculty);
})

//get index
app.get('/faculty/:id',(req,res)=>{
    const ans= faculty.find((fac)=>{
        if(fac.id==req.params.id){
            return true;
        }
    });
    res.send(ans);
})

//creat
app.post('/ faculty',(req,res)=>{
     faculty.push(req.body);
    res.send(' faculty add');
})

//update
app.patch('/ faculty/:id',(req,res)=>{
    const indextoedit= faculty.findIndex(( fac)=>{
        if( fac.id==req.params.id){
            return true;
        }
    });
     faculty[indextoedit]=req.body;
    res.send('faculty update');
})

//delete
app.delete('/ faculty/:id',(req,res)=>{
    const indexToDelete= faculty.findIndex(( fac)=>{
        if( fac.id==req.params.id){
            return true;
        }
    })
     faculty.splice(indexToDelete,1);
    res.send(' faculty delete');
});

//search
app.get('/ faculty/search/:text',(req,res)=>{
    const ans= faculty.filter( fac=>{
        if( fac.name.indexOf(req.params.text)>-1){
            return true;
        }
    });
    res.send(ans);
})

//from - to
app.get('/ faculty/filter/:from-:to',(req,res)=>{
    const ans= faculty.filter(( fac)=>{
        if( fac.id>res.params.from &&  fac.id<req.params.to){
            return true;
        }
    });
    res.send(ans);
});

app.listen(3004,()=>{
    console.log("server satarted at 3004");
})