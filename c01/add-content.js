var today= new Date();  // make a new date object
var hourNow = today.getHours(); // This find the current time
var greeting;
// Show the greeting based on the current time
if (hourNow >18){

    greeting = 'Good evening!';

}
else if (hourNow >12){
    greeting = 'Good afternoon!';

}
else if (hourNow >0)

{
    greeting = 'Good morning';
}
else {
    greeting = 'Welcome!';
}

document.write('<h3>' + greeting + '</h3>');




