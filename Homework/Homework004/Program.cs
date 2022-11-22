// Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B. 
//(Задачи, решенные через Math.Pow, будут отправлены на переделку, так как задача стоит в том, чтобы написать цикл)

/*
Console.Write("Введите первое число: ");
int Num = int.Parse(Console.ReadLine()!);
Console.Write("Введите второе число: ");
int Num2 = int.Parse(Console.ReadLine()!);
Console.WriteLine($"Число {Num} в степени {Num2} равно {Degree(Num, Num2)}");


int Degree(int number1, int number2)
{
    int result = number1;
    for (int i = 1; i < number2; i++)
    {
        result = result * number1;

    }
    return result;
}
*/


//Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.

/*
Console.Write("Введите число: ");
int Num = int.Parse(Console.ReadLine()!);
Console.WriteLine($"Сумма цифр числа {Num} равна {Sum(Num)}");

int Sum(int number)
{
    int result = 0;
    while (Num != 0)
    {
        result = result + Num % 10;
        Num = Num / 10;
    }
    return result;
}
*/


//Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран. (числа берете любые)

/*
int[] ArrayMain = Array(8);
Console.WriteLine($"Массив из 8-ми элементов с рандомными числами: [{String.Join("  ", ArrayMain)}]");

int[] Array(int number)
{
    int[] arrayN = new int[8];
    for (int i = 0; i < arrayN.Length; i++)
    {
        arrayN[i] = new Random().Next(50, 100);
    }
    return arrayN;
}
*/
