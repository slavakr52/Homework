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
                    if (userList.size() != 0) {
                        System.out.println(userList);
                    } else {
                        System.out.println("\nList is empty");
                    }
                    System.out.println("(press Enter to continue)");
                    input.nextLine();
                    break;

                case "revert":
                    if (userList.size() != 0) {
                        userList.removeFirst();
                        System.out.println("\nLast added string removed");
                    } else {
                        System.out.println("\nList is empty");
                    }
                    System.out.println("(press Enter to continue)");
                    input.nextLine();
                    break;

                case "add":
                    userList.add(0, userAddString(input));
                    System.out.println("\nLine added"
                            + "\n(press Enter to continue)");
                    input.nextLine();
                    break;

                case "exit":
                    flag = false;
                    break;
            }
        }
        input.close();
    }

    private static String userAddString(Scanner input) {
        String text;
        System.out.println("Enter new string: ");
        if (input.hasNextLine()) {
            text = input.nextLine();
        } else {
            text = "error";
        }
        return text;
    }

    private static String userInput(Scanner input) {
        String text;
        System.out.println("\nYou may add a line or enter action"
                + "\nAvailable actions:\n\tadd\n\tprint\n\trevert\n\texit"
                + "\nEnter action: ");
        if (input.hasNextLine()) {
            text = input.nextLine();
        } else {
            text = "error";
        }
        return text.toLowerCase();
    }
}
