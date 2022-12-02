Console.WriteLine("Задачи:");
Console.WriteLine("№1. Задайте двумерный массив размером mхn, заполненный случайными вещественными числами.");
Console.WriteLine("№2. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве,");
Console.WriteLine("и возвращает значение этого элемента или же указание, что такого элемента нет.");
Console.WriteLine("№3. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.");
Console.WriteLine();
Console.WriteLine("Введите номер задачи для демонстрации её работы:");

int number = int.Parse(Console.ReadLine()!);
switch (number)
{
    case 1: // Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.

        Console.WriteLine();
        Console.WriteLine("Введите количество строк массива, затем количество столбцов массива: ");
        int rows1 = int.Parse(Console.ReadLine()!);
        int columns1 = int.Parse(Console.ReadLine()!);
        Console.WriteLine();

        double[,] ArrayMain1 = CreateRandomDoubleArray(rows1, columns1);
        PrintDoubleArray(ArrayMain1);

        break;

    case 2: // Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает значение этого элемента или же указание, что такого элемента нет.

        Console.WriteLine();
        Console.WriteLine("Введите количество строк массива, затем количество столбцов массива: ");
        int rows2 = int.Parse(Console.ReadLine()!);
        int columns2 = int.Parse(Console.ReadLine()!);
        Console.WriteLine();
        int[,] ArrayMain2 = CreateRandomArray(rows2, columns2);
        PrintArray(ArrayMain2);
        Console.WriteLine();
        Console.WriteLine("Введите позицию элемента (строка, столбец): ");
        int positionX = int.Parse(Console.ReadLine()!);
        int positionY = int.Parse(Console.ReadLine()!);

        Console.WriteLine($"Искомый элемент имеет значение {ElementValue(ArrayMain2, positionX, positionY)}");

        break;
    case 3: // Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

        Console.WriteLine();
        Console.WriteLine("Введите количество строк массива, затем количество столбцов массива: ");
        int rows3 = int.Parse(Console.ReadLine()!);
        int columns3 = int.Parse(Console.ReadLine()!);
        Console.WriteLine();
        int[,] ArrayMain3 = CreateRandomArray(rows3, columns3);
        PrintArray(ArrayMain3);
        Console.WriteLine();

        ColumnAverage(ArrayMain3);

        break;
    default:
        Console.WriteLine("Такой задачи нет");
        break;
}

//================================= Методы =================================

// Создание двумерного массива с рандомными вещественными числами
double[,] CreateRandomDoubleArray(int m, int n)
{
    double[,] result = new double[m, n];
    double x = 0;

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            x = new Random().NextDouble() * 100;
            x = Math.Round(x, 1);
            if (x < 10) x = x + 10;
            result[i, j] = x;
        }
    }
    return result;
}

// Печать массива с вещественными числами
void PrintDoubleArray(double[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        Console.Write("[");
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine("]");
    }
}

// Создание двумерного массива с рандомными числами от 10 до 100
int[,] CreateRandomArray(int m, int n)
{
    int[,] result = new int[m, n];

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            result[i, j] = new Random().Next(10, 100);
        }
    }
    return result;
}

// Печать массива
void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        Console.Write("[ ");
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine("]");
    }
}

// Возвращение элемента по его позиции
int ElementValue(int[,] array, int posX, int posY)
{
    int result = 0;
    if (posX >= array.GetLength(0) || posY >= array.GetLength(1)) Console.WriteLine("Такого элемента нет!");
    else
    {
        for (int i = 0; i < array.GetLength(0); i++)
        {
            for (int j = 0; j < array.GetLength(1); j++)
            {
                if (i == posX && j == posY) result = array[i, j];
            }
        }
    }
    return result;
}

// Поиск среднего арифметического столбцов
void ColumnAverage(int[,] array)
{

    for (int i = 0; i < array.GetLength(1); i++)
    {
        double sum = 0;
        double avg = 0;
        for (int j = 0; j < array.GetLength(0); j++)
        {
            sum = sum + array[j, i];
        }
        avg = sum / array.GetLength(0);
        Console.WriteLine($"Среднее значение столбца {i} = {avg}");
    }
    Console.WriteLine();
}
