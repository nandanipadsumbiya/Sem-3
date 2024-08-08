const os=require('os');

//Returns: <string>  return hostname
// console.log(os.hostname());


//Returns: <number[]>
//on windows always returns [0,0,0]
// console.log(os.loadavg());



// console.log(os.machine());


//Returns: <integer>
//return amount of free system memory 
// console.log(os.freemem());

console.log(os.homedir());