const fs=require('fs');


//readfile
// fs.readFile('path.js',(err,data)=>{
// 	console.log(data.toString());
// });


//readFileSync and readFileAsync
// const data= fs.readFileSync('pathdemo.txt');
// console.log(data.toString());

// const data2= fs.readFileAsync('pathdemo.txt');
// console.log(data2.toString());


//writefile
// fs.writeFile('path.txt','hello',(err)=>{
// 	console.log('file success');
// });



//exists
// fs.exists('path.js',(ans)=>{
// 	console.log(ans ? 'found' : 'not found') ;
// });


//appendfile  path.txt ma kai write kariyu hoi te aem j rahe and appendfile ma je aapi te aema add thai
// fs.appendFile('path.txt','hyyy',(err)=>{
// 	console.log('file write success');//Asyachronous=non blocking and sychronous=blocking
// });


//stat
// fs.stat('path.js',(err,data)=>{
// 	console.log(data);
// });


//unlink
// fs.unlink('path.txt',(err)=>{
// 	console.log('file delete');
// });


//rename
// fs.rename('path.txt','pathdemo.txt',(err)=>{
// 	console.log('file rename successfuly');
// })


// fs.writeFile('darshan.txt','darshan university',(err)=>{
// 	console.log('file success');
// });

fs.writeFileSync('darshan.txt','darshan');
console.log('file sucess');





//fs.writefileSync("filename","hello");