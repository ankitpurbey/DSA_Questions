let str ="Ankitkumar"
str.indexOf("kumar")
// Method chaining


let msg ="helloAnkit";
let newMsg = msg.trim().toUpperCase();
console.log(newMsg);


//slice
console.log(msg.slice(4,10));

// qs
let months =["jan","feb","march"];

// we have to print aprili,may,june
months.shift();
months.shift();
months.unshift("april");
months.unshift("may")
months.unshift("june")
console.log(months);

// qs Roll-dice

// function rolldice(){
//     let rand  =Math.floor(Math.randam()*6)+1;
//     console.log(rand);
// }
// rolldice();

//argument in function
/*function printName(name,age){
    console.log(`${name}'s age is ${age}`);
}
printName("AnkitPurbey",20);*/

//calculate avg of number

// function calAvg(a,b,c){
//     let avg= (a+b+c)/3;
//     console.log(avg);
// }
// calAvg(3,3,3);
// calAvg(4,2,2);


//print table of `10
function printTable(n){
    for(let i=n; i<=n*10; i+=10){
        console.log(i);
    }
}
printTable(10); 

// use of this 
const student ={
    name:"ankit",
    age:20,
    math:78,
    eng:90,
    adsa:91,
    getAvg(){
        let avg1= (match+eng+adsa)/3;
        console.log(`${this.name} got avg = ${age}`);
    }
    
}
async function greet(){
    return "This is ankit"
}
