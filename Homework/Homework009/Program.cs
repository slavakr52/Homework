Console.WriteLine("Введите номер задачи:");
int number = int.Parse(Console.ReadLine()!);
switch (number)
{
    case 1: // **Задача 1** Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. Выполнить с помощью рекурсии.

        Console.WriteLine("Введите число:");
        int N1 = int.Parse(Console.ReadLine()!);

        Console.WriteLine(PrintNumbers(N1, 1));

        string PrintNumbers(int start, int end)
        {
            if (start == end) return start.ToString();
            return (start + " " + PrintNumbers(start - 1, end));
        }

        break;


    case 2: // **Задача 2** Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.

        Console.WriteLine("Введите начало интервала:");
        int M2 = int.Parse(Console.ReadLine()!);
        Console.WriteLine("Введите конец интервала:");
        int N2 = int.Parse(Console.ReadLine()!);

        Console.WriteLine($"Сумма натуральных элементов от {M2} до {N2} равна {IntervalSum(M2, N2)}");

        int IntervalSum(int start, int end)
        {
            if (start > end) return 0;
            return (start + IntervalSum(start + 1, end));
        }

        break;



    case 3: // **Задача 3** Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.

        Console.WriteLine("Введите число M:");
        int M3 = int.Parse(Console.ReadLine()!);
        Console.WriteLine("Введите число N:");
        int N3 = int.Parse(Console.ReadLine()!);

        if (M3 > 3 || N3 > 4) Console.WriteLine("Не надо вводить в эту функцию такие большие числа");
        else
        {
            Console.WriteLine($"Результат работы функции Аккермана с числами M = {M3} и N = {N3}: {AkkermanFunction(M3, N3)}");

            int AkkermanFunction(int m, int n)
            {
                if (m == 0) return n + 1;
                else
                {
                    if (m > 0 && n == 0) return AkkermanFunction(m - 1, 1);
                    else return AkkermanFunction(m - 1, AkkermanFunction(m, n - 1));
                }
            }
        }

        break;

    default:
        Console.WriteLine("Такой задачи нет");
        break;

}