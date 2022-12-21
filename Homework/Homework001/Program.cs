// Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее

/*
Console.WriteLine("Введите первое число:");
int N1 = int.Parse(Console.ReadLine()!);
Console.WriteLine("Введите второе число:");
int N2 = int.Parse(Console.ReadLine()!);
int MAX = N1;
int MIN = N1;

if (N1 > MAX) MAX = N1;
if (N2 > MAX) MAX = N2;
if (N1 < MIN) MIN = N1;
if (N2 < MIN) MIN = N2;

Console.WriteLine($"Большее число - {MAX}, меньшее число - {MIN}");
*/

// Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел

/*
Console.WriteLine("Введите первое число:");
int N1 = int.Parse(Console.ReadLine()!);
Console.WriteLine("Введите второе число:");
int N2 = int.Parse(Console.ReadLine()!);
Console.WriteLine("Введите третье число:");
int N3 = int.Parse(Console.ReadLine()!);

int MAX = N1;
if (N1 > MAX) MAX = N1;
if (N2 > MAX) MAX = N2;
if (N3 > MAX) MAX = N3;

Console.WriteLine($"Максимальное число - {MAX}");
*/

// Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка)

/*
Console.WriteLine("Введите число:");
int N1 = int.Parse(Console.ReadLine()!);
if (N1%2==0) Console.WriteLine($"Число {N1} является чётным");
else Console.WriteLine($"Число {N1} является нечётным");
*/

//Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N

/*
Console.WriteLine("Введите число:");
int N = int.Parse(Console.ReadLine()!);
int X = 2;

Console.Write($"Все чётные числа от 1 до {N}: ");
while (X <= N)
{
    Console.Write($"{X} ");
    X+=2;
}
*/