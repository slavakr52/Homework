const input = prompt("Введите ваше имя: ");
greeting(input);
alert("А теперь загляните в консоль..");

function greeting(name){
    console.log("Здравствуй, " + name + "!");
}