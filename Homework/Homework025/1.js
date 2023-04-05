
function celsiusToFahrenheit(celsius) {
    const fahrenheit = (9 / 5) * celsius + 32;
    return fahrenheit;
}

const value = Number.parseFloat(prompt("Введите температуру в градусах Цельсия: "));
const fahrenheit = celsiusToFahrenheit(value);

function valueOutControl(value) {        // красиво выводит, сколько градусов (1 градус, 2 градуса, 5 градусов)
    let out;
    x = value % 10;

    if (x == 1) out = "градус по Цельсию равен";
    if (x > 1 && x < 5) out = "градуса по Цельсию равны";
    if (x >= 5 || x == 0) out = "градусов по Цельсию равны";
       
    return out;
}

const valueOut = valueOutControl(value);
alert(value + " " + valueOut + " " + fahrenheit.toFixed(1) + " по Фаренгейту");
alert(":)")
