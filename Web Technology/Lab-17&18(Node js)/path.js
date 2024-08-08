const path=require('path');

const filepath="C:\\Users\\nanda\\OneDrive\\Desktop\\Web Technology (WT)\\Lab-17\\abc.txt"

ans1= path.dirname(filepath);
console.log("dirname = ",ans1);

ans2=path.basename(filepath);
console.log("basename =",ans2);

ans3=path.extname(filepath);
console.log("extname = ",ans3);

ans4=path.join('/abc','/xyz','qwe');
console.log("join =",ans4);

ans5=path.normalize('/abc/zxy/..');
console.log("normalize =",ans5);

ans6=path.resolve('hello','lab-17');
console.log("resolve =",ans6);

ans7=path.relative('/abc/xyz','/abc/opq');
console.log("relative =",ans7);