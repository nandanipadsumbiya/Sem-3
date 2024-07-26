const http=require('http');
const fs=require('fs');

const server=http.createServer((req,res)=>{
    res.setHeader("Contact-type","text-html");
    res.write("<a style='margin-left:50px;margin-right:50px;border: 1px solid black;background-color:lightblue;color:grey' href='about.html'>about</a>");
    res.write("<a style='margin-left:50px;margin-right:50px;border: 1px solid black;background-color:lightblue;color:grey' href='contact.html'>contact</a>");
    //res.write("<a href="about.html"</a>");
    if(req.url=="/about.html"){
        const data=fs.readFileSync("about.html",'utf-8');
        res.end(data.toString());
    }
    else if(req.url=="/contact.html"){
       const data=fs.readFileSync("contact.html",'utf-8');
        res.end(data.toString());
    }
    
    
});

server.listen(3040,()=>{
    console.log("server started at 3000");
});