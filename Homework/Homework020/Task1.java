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
        boolean flag = true;

        while (flag == true) {
        
            String userInput = userInput();

            switch (userInput) {
                case "print":
                    System.out.println("case");
                    break;

                default:
                System.out.println("def");
                break;
            }
        }
    }

    private static String userInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nYou may add a line or enter action"
                + "\nAvailable actions:\nprint\nrevert\nexit"
                + "\nEnter text or action: ");
        String text = input.nextLine();
        input.close();

        return text.toLowerCase();
    }
}