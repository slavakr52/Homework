package Homework.Homework.Homework017;

import java.util.Scanner;

/**
 * Написать метод, который определяет, является ли год високосным,
 * и возвращает boolean (високосный - true, не високосный - false).
 * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый
 * 400-й – високосный.
 */

public class Task2 {
    public static void main(String[] args) {

        leapYearCheck();
    }

    private static void leapYearCheck() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        input.close();

        boolean checkResult = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        System.out.println(year + " is a leap year: " + checkResult);

    }
}
