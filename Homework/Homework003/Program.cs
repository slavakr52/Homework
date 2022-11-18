//Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом(первое число равно последнему, второе равно предпоследнему)

/*
Console.WriteLine("Введите пятизначное число: ");
string Number = Console.ReadLine()!;

if (Number.Length != 5)
{
    Console.WriteLine("Введено неверное число!");
}
else
{
    if (Number[0] == Number[4] && Number[1] == Number[3])
    {
        Console.WriteLine($"Число {Number} является палиндромом");
    }
    else
    {
        Console.WriteLine($"Число {Number} НЕ является палиндромом");
    }
}
*/

//Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.

/*
Console.WriteLine("Введите координаты первой точки в порядке X, Y, Z: ");
int aX = int.Parse(Console.ReadLine()!);
int aY = int.Parse(Console.ReadLine()!);
int aZ = int.Parse(Console.ReadLine()!);
Console.WriteLine("Введите координаты второй точки в порядке X, Y, Z: ");
int bX = int.Parse(Console.ReadLine()!);
int bY = int.Parse(Console.ReadLine()!);
int bZ = int.Parse(Console.ReadLine()!);

double AB = Math.Sqrt(Math.Pow(bX - aX, 2) + Math.Pow(bY - aY, 2) + Math.Pow(bZ - aZ, 2));

Console.WriteLine($"Длина отрезка между точками в пространстве равна {AB:f2}");
*/

//Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N

/*
Console.WriteLine("Введите число: ");
int N = int.Parse(Console.ReadLine()!);
Console.WriteLine($"Таблица кубов от 1 до {N}: ");
for (int i = 1; i < N + 1; i++)
{
    Console.WriteLine($"{Math.Pow(i, 3)}");
}
*/