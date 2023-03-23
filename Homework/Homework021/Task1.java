package Homework021;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
 * человек может иметь несколько телефонов.
 */
public class Task1 {

    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Scanner pressEnter = new Scanner(System.in);
        Scanner contact = new Scanner(System.in);
        boolean flag = true;

        while (flag == true) {

            int userInput = userChoice(input);

            switch (userInput) {
                case 1:
                    if (phoneBook.size() != 0) {
                        for (String number : phoneBook.keySet()) {
                            String phoneNumber = number.toString();
                            String name = phoneBook.get(phoneNumber).toString();
                            System.out.println("Name: " + name + ", tel: " + phoneNumber);
                        }
                    } else {
                        System.out.println("Phone book is empty! Add a new contact");
                    }
                    System.out.println("\n(press Enter to continue)");
                    pressEnter.nextLine();
                    break;

                case 2:
                    phoneBook.put(addPhoneNumber(contact), addName(contact));
                    System.out.println("\nContact added"
                            + "\n(press Enter to continue)");
                    pressEnter.nextLine();
                    break;

                case 3:
                    flag = false;
                    System.out.println("Exit...");
                    break;
            }
        }
        input.close();
        pressEnter.close();
        contact.close();
    }

    private static int userChoice(Scanner input) {
        int number = 0;
        System.out.println("\nYou may enter action"
                + "\nAvailable actions:\n\t1. Show all contacts"
                + "\n\t2. Add new contact\n\t3. Exit"
                + "\nEnter action: ");
        if (input.hasNextInt()) {
            number = input.nextInt();
        } else {
            System.out.println("Error");
        }
        return number;
    }

    private static String addName(Scanner contact) {
        String newContact;
        System.out.println("Enter name: ");
        if (contact.hasNextLine()) {
            newContact = contact.nextLine();
        } else {
            newContact = "error";
        }
        return newContact;
    }

    private static String addPhoneNumber(Scanner contact) {
        String phoneNumber;
        System.out.println("Enter phone number: ");
        if (contact.hasNextLine()) {
            phoneNumber = contact.nextLine();
        } else {
            phoneNumber = "error";
        }
        return phoneNumber;
    }

}