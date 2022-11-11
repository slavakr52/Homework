// Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее

Console.WriteLine("Введите первое число: ");
int N1 = int.Parse(Console.ReadLine()!);
Console.WriteLine("Введите второе число: ");
int N2 = int.Parse(Console.ReadLine()!);
int MAX = N1;
int MIN = N1;

if (N1 > MAX) MAX = N1;
if (N2 > MAX) MAX = N2;
if (N1 < MIN) MIN = N1;
if (N2 < MIN) MIN = N2;

Console.WriteLine($"Большее число - {MAX}, меньшее число - {MIN}");