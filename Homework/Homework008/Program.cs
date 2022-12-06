


Console.WriteLine();
Console.WriteLine("Введите количество строк массива, затем количество столбцов массива: ");
int rows2 = int.Parse(Console.ReadLine()!);
int columns2 = int.Parse(Console.ReadLine()!);
Console.WriteLine("Массив:");
int[,] ArrayMain = CreateRandomArray(rows2, columns2);
PrintArray(ArrayMain);
Console.WriteLine();

Console.WriteLine("Введите номер задачи для демонстрации её работы:");

int number = int.Parse(Console.ReadLine()!);
switch (number)
{
    case 1:
        // ==========================Задача 1==========================
        // Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива

        Console.WriteLine("Массив со строками по убыванию:");
        PrintArray(DescendRows(ArrayMain));
        break;

    case 2:
        // ==========================Задача 2==========================
        // Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов

        Console.WriteLine($"Номер строки с наименьшей суммой элементов: {MinimalAmountRow(ArrayMain)}");
        break;

    case 3:
        // ==========================Задача 3==========================
        // Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.

        int[,] ArraySecond = CreateRandomArray(rows2, columns2);
        Console.WriteLine("Второй массив:");
        PrintArray(ArraySecond);
        Console.WriteLine("Произведение первого и второго массивов:");
        PrintArray(MultArrays(ArrayMain, ArraySecond));
        break;





    default:
        Console.WriteLine("Такой задачи нет");
        break;
}

// ==========================Методы==========================

// Создание двумерного массива с рандомными числами от 10 до 30
int[,] CreateRandomArray(int m, int n)
{
    int[,] result = new int[m, n];

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            result[i, j] = new Random().Next(10, 30);
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

// Сортировка строк массива по убыванию (задача 1)
int[,] DescendRows(int[,] array)
{
    int temp = 0;
    for (int x = 0; x < array.GetLength(0); x++)
    {
        for (int i = 0; i < array.GetLength(1); i++)
        {
            for (int j = 0; j < array.GetLength(1) - 1; j++)
            {
                if (array[x, j] < array[x, j + 1])
                {
                    temp = array[x, j + 1];
                    array[x, j + 1] = array[x, j];
                    array[x, j] = temp;
                }
            }
        }
    }
    return array;
}

// Поиск строки с минимальной суммой элементов (задача 2)
int MinimalAmountRow(int[,] array)
{
    int mainSum = 0;
    int sum = 0;
    int result = 1;
    for (int i = 0; i < array.GetLength(1); i++)
    {
        mainSum = mainSum + array[0, i];
    }
    for (int x = 0; x < array.GetLength(0); x++)
    {
        sum = 0;
        for (int y = 0; y < array.GetLength(1); y++)
        {
            sum = sum + array[x, y];
        }
        if (sum < mainSum)
        {
            mainSum = sum;
            result = x + 1;
        }
    }
    return result;
}

// Произведение двух матриц одного размера (задача 3)
int[,] MultArrays(int[,] array1, int[,] array2)
{
    if (array1.GetLength(1) != array2.GetLength(0)) Console.WriteLine("Работаем только с матрицами одного размера!");

    int[,] resultArray = new int[array1.GetLength(0), array2.GetLength(1)];
    for (int i = 0; i < array1.GetLength(0); i++)
    {
        for (int j = 0; j < array2.GetLength(1); j++)
        {
            for (int k = 0; k < array2.GetLength(0); k++)
            {
                resultArray[i, j] += array1[i, k] * array2[k, j];
            }
        }
    }
    return resultArray;
}