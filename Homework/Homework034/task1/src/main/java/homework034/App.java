package homework034;

import java.util.Scanner;

/*
Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException 
с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".
*/

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();
            numberControl(number);
        } catch (InvalidNumberException ex) {
            System.out.println(ex.getMessage());
        }
        scanner.nextLine();
    }

    public static void numberControl(int num) throws InvalidNumberException {
        if (num <= 0) {
            throw new InvalidNumberException("Некорректное число");
        } else {
            System.out.println("Число корректно");
        }
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}