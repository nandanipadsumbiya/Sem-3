const https=require('https');

const server = https.createServer((req,res)=>{
	res.end('hello');
});

server.listen(8080,()=>{
	console.log('server start at 8080');
})