﻿// Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа. Обязательна проверка на ввод чисел больше/меньше 3-х знаков

/*
Console.WriteLine("Введите трёхзначное число: ");
string Numbers = Console.ReadLine()!;

if (Numbers.Length != 3)
{
    Console.WriteLine("Введено неверное число!");
}
else
{
    Console.WriteLine($"Вторая цифра числа {Numbers} равна {Numbers[1]}");

}
*/

//Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет. Берем числа до 100000

/*
Console.WriteLine("Введите число от 0 до 100000: ");
string Numbers = Console.ReadLine()!;

if (Numbers.Length > 5) 
{
    Console.WriteLine("Введено неверное число!");         //В данной задаче правильнее было бы ещё ввести игнорирование минуса перед числом, т.к. в условии не сказано, что
}                                                        //число обязательно положительное. Если мы введём, например, "-2752", то третьей цифрой программа назовёт "7", хотя
else                                                    //это, разумеется, некорректно. При этом я понимаю, что скорее всего, пока что не требуется заморачиваться на этот счёт,
{                                                      //но если всё же стоит это сделать, могу погуглить как это воплотить и переделать))
    if (Numbers.Length <= 2)
    {
        Console.WriteLine("Третьей цифры в данном числе нет");
    }
    else
    {
        Console.WriteLine($"Третья цифра числа {Numbers} равна {Numbers[2]}");

    }
}
*/

//Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным. Обязательна проверка на ввод числа <1 и >8

/*
Console.WriteLine("Введите номер дня недели: ");
int N = int.Parse(Console.ReadLine()!);

if (N == 6 || N == 7)
{
    Console.Write("Ура, выходной!");
}
else
{
    if (N > 0 && N < 6)
    {
        Console.Write("Трудовые будни (не выходной)");
    }
    else
    {
        Console.Write("Такого дня недели нет");
    }
}
*/