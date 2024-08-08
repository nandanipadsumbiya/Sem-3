
const express = require('express');
const bodyParser=require('body-parser');

const app=express();
app.use(bodyParser.urlencoded());
//app.use(express.json());

const product=[
    {
        id:101,
        name: 'computer',
        price:111
       
    },
    {
        id:102,
        name:'phone',
        price:222
       
    },
    {
        id:103,
        name:'book',
        price:333
       
    }
]


//get all
app.get('/product',(req,res)=>{
    res.send(product);
})

//get index
app.get('/product/:id',(req,res)=>{
    const ans= product.find((pro)=>{
        if(pro.id==req.params.id){
            return true;
        }
    });
    res.send(ans);
})

//creat
app.post('/product',(req,res)=>{
     product.push(req.body);
    res.send(' product add');
})

//update
app.patch('/product/:id',(req,res)=>{
    const indextoedit= product.findIndex(( pro)=>{
        if( pro.id==req.params.id){
            return true;
        }
    });
     product[indextoedit]=req.body;
    res.send('product update');
})

//delete
app.delete('/product/:id',(req,res)=>{
    const indexToDelete= product.findIndex(( pro)=>{
        if( pro.id==req.params.id){
            return true;
        }
    })
     product.splice(indexToDelete,1);
    res.send(' product delete');
});

//search
app.get('/product/search/:name',(req,res)=>{
    const ans= product.filter( pro=>{
        if( pro.name.indexOf(req.params.name)>-1){
            return true;    
        }
    });
    res.send(ans);
})

//from - to
app.get('/product/filter/:from-:to',(req,res)=>{
    const ans= product.filter(( pro)=>{
        if( pro.price>res.params.from &&  pro.price<req.params.to){
            return true;
        }
    });
    res.send(ans);
});

app.listen(3004,()=>{
    console.log("server satarted at 3004");
})