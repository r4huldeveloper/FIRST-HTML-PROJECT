function myClick(){
    document.getElementById("word").innerHTML = "Hello Yufi:)"

    const person={
        firstName:"Rahul",
        lastName:"Sharma",
        age:20,
        eyeColor:"black"
    };

    document.getElementById("demo").innerHTML= person.firstName+" is "+person.age+" years old."

    document.getElementById('time').innerHTML=Date();
}