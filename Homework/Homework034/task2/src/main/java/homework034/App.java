package homework034;

import java.util.Scanner;

/**
 * Задача 2:
 * Напишите программу, которая запрашивает у пользователя два числа и выполняет
 * их деление.
 * Если второе число равно нулю, программа должна выбрасывать исключение
 * DivisionByZeroException
 * с сообщением "Деление на ноль недопустимо". В противном случае, программа
 * должна выводить результат деления.
 */

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            division(a, b);
        } catch (DivisionByZeroException exception) {
            System.out.println(exception.getMessage());
        }
        scanner.nextLine();
    }

    public static void division(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            System.out.println(a / b);
        }
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
