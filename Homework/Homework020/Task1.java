package Homework020;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Реализовать консольное приложение, которое:
 * - Принимает от пользователя и “запоминает” строки.
 * - Если введено print, выводит строки так, чтобы последняя введенная была
 * первой
 * в списке, а первая - последней.
 * - Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class Task1 {

    public static void main(String[] args) {

        LinkedList<String> userList = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        while (flag == true) {

            String userInput = userInput(input);

            switch (userInput) {
                case "print":
                    System.out.println("case");
                    flag = false;

                default:
                    System.out.println("def");
                    break;
            }
        }
        input.close();
    }

    private static String userInput(Scanner input) {

        String text;
        System.out.println("\nYou may add a line or enter action"
                + "\nAvailable actions:\nprint\nrevert\nexit"
                + "\nEnter text or action: ");
        if (input.hasNextLine()) {
            text = input.nextLine();
        } else {
            text = "error";
        }
        // 

        return text.toLowerCase();
    }
}

/*
 * public String scan(Scanner s) {
 * String input;
 * if (s.hasNextLine()) {
 * input = s.nextLine();
 * } else {
 * input = "ERROR";
 * }
 * return input.toLowerCase();
 */