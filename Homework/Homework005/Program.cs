// Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.

/*
int[] ArrayMain = Array(20, 100, 1000);
Console.WriteLine($"Массив: [{String.Join(", ", ArrayMain)}]");

int[] Array(int number, int minValue, int maxValue)
{
    int[] arrayN = new int[number];
    for (int i = 0; i < arrayN.Length; i++)
    {
        arrayN[i] = new Random().Next(minValue, maxValue + 1);
    }
    return arrayN;
}

int SearchCount(int[] array)
{
    int count = 0;
    foreach (int element in array)
    {
       
        if (element % 2 == 0)
        {
            count++;
        }
    }
    return count;
}
Console.WriteLine($"Количество чётных чисел массива равно {SearchCount(ArrayMain)}");
*/

// Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях(индексы элементов должны быть нечетными(1,3,5 и тд)).

/*
Console.Write("Размер массива: ");
int Size = int.Parse(Console.ReadLine()!);
Console.Write("Начало диапазона массива: ");
int MinValue = int.Parse(Console.ReadLine()!);
Console.Write("Конец диапазона массива: ");
int MaxValue = int.Parse(Console.ReadLine()!);

int[] ArrayMain = Array(Size, MinValue, MaxValue);
Console.WriteLine($"Массив: [{String.Join(", ", ArrayMain)}]");

int OddIndexSum = 0;
for (int i = 0; i < ArrayMain.Length; i++)
{
    if (i % 2 != 0)
    {
        OddIndexSum = OddIndexSum + ArrayMain[i];
    }
}

Console.WriteLine($"Сумма элементов данного массива с нечётным индексом равна {OddIndexSum}");

int[] Array(int number, int minValue, int maxValue)
{
    int[] arrayN = new int[number];
    for (int i = 0; i < arrayN.Length; i++)
    {
        arrayN[i] = new Random().Next(minValue, maxValue + 1);
    }
    return arrayN;
}
*/

// Найдите произведение пар чисел в одномерном массиве. Парой считаем первый и последний элемент, второй и предпоследний и т.д. Результат запишите в новом массиве.

/*
Console.Write("Размер массива: ");
int Size = int.Parse(Console.ReadLine()!);
Console.Write("Начало диапазона массива: ");
int MinValue = int.Parse(Console.ReadLine()!);
Console.Write("Конец диапазона массива: ");
int MaxValue = int.Parse(Console.ReadLine()!);

int[] ArrayMain = Array(Size, MinValue, MaxValue);
int[] ArrayMain2 = Array2(ArrayMain);
Console.WriteLine($"Массив: [{String.Join(", ", ArrayMain)}]");
Console.WriteLine($"Массив с произведениями пар чисел: [{String.Join(", ", ArrayMain2)}]");

int[] Array(int number, int minValue, int maxValue)
{
    int[] arrayN = new int[number];
    for (int i = 0; i < arrayN.Length; i++)
    {
        arrayN[i] = new Random().Next(minValue, maxValue + 1);
    }
    return arrayN;
}

int[] Array2(int[] array)
{
    int[] array2N = new int[array.Length / 2];
    for (int i = 0; i < array.Length / 2; i++)
    {
        array2N[i] = array[i] * array[array.Length -1 - i];
    }
    return array2N;
}
*/

// Задайте массив целых чисел от -10 до 10. Найдите разницу между максимальным и минимальным элементов массива.

/*
int[] ArrayMain = Array(10, -10, 10);
Console.WriteLine($"Массив: [{String.Join(", ", ArrayMain)}]");

int[] Array(int number, int minValue, int maxValue)
{
    int[] arrayN = new int[number];
    for (int i = 0; i < arrayN.Length; i++)
    {
        arrayN[i] = new Random().Next(minValue, maxValue + 1);
    }
    return arrayN;
}

int MaxElement = -10;
int MinElement = 10;

foreach (int element in ArrayMain)
{
    if (element > MaxElement)
    {
        MaxElement = element;
    }
    if (element < MinElement)
    {
        MinElement = element;
    }
}
Console.WriteLine($"Максимальное число массива: {MaxElement}");
Console.WriteLine($"Минимальное число массива: {MinElement}");
Console.WriteLine($"Разница между максимальным и минимальным числами массива: {MaxElement - MinElement}");
*/
