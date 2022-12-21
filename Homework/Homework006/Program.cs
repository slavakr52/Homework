// Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел строго больше 0 ввёл пользователь.

/*
int[] UserArray = GetNewArray(15, -100, 100);
Console.WriteLine($"Введённые пользователем числа: [{String.Join(", ", UserArray)}]");
Console.WriteLine($"Из них положительных чисел - {PositiveNumberCount(UserArray)}");

int [] GetNewArray (int size, int minValue, int maxValue)
{
    int[] array = new int[size];
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(minValue, maxValue +1);
    }
    return array;
}

int PositiveNumberCount (int[] array)
{
    int count = 0;
    foreach (int item in array)
    {
        if (item > 0) count++;
    }
    return count;
}
*/

// Написать программу, которая на вход принимает массив из любого количества элементов (не менее 6)в промежутке от 0 до 100, 
// а на выходе выводит этот же массив, но отсортированный по возрастанию(от меньшего числа к большему).

/*
int[] ArrayMain = GetNewArray(15, 0, 100);
int[] ArrayAsc = Array2Ascending(FillArray2(ArrayMain));
Console.WriteLine($"Массив: [{String.Join(", ", ArrayMain)}]");
Console.WriteLine($"Массив по возрастанию: [{String.Join(", ", ArrayAsc)}]");

int[] GetNewArray(int size, int minValue, int maxValue)
{
    int[] array = new int[size];
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(minValue, maxValue + 1);
    }
    return array;
}

int[] FillArray2(int[] arrayX)
{
    int[] NewArray = new int[arrayX.Length];
    for (int i = 0; i < NewArray.Length; i++)
    {
        NewArray[i] = arrayX[i];
    }
    return NewArray;
}

int[] Array2Ascending(int[] arrayZ)
{
    int temp = 0;
    for (int i = 0; i < arrayZ.Length; i++)
    {
        for (int j = 0; j < arrayZ.Length - 1; j++)
        {
            if (arrayZ[j] < arrayZ[j + 1])
            {
                temp = arrayZ[j + 1];
                arrayZ[j + 1] = arrayZ[j];
                arrayZ[j] = temp;
            }
        }
    }
    return arrayZ;
}
*/