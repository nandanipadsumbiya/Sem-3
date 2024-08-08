const child_process=require('child_process');

child_process.exec('pathdemo.txt',(err,stdout,stdin)=>{
	//console.log('hello');
	console.log(stdout);
	
})