
package Homework.Homework.Homework018;

import java.util.Scanner;

/**
 * Напишите метод, который принимает на вход строку (String) и определяет
 * является ли строка палиндромом (возвращает boolean значение).
 */
public class Task1 {

    public static void main(String[] args) {
        String str = incomingWord();
        System.out.printf("Word '%s' is a palindrome: %s", str, palindromeCheck(str));
    }

    private static boolean palindromeCheck(String word) {

        boolean flag = true;

        int ind1 = 0;
        int ind2 = word.length() - 1;
        while (ind1 < ind2) {
            if (word.charAt(ind1) == word.charAt(ind2)) {
                ind1++;
                ind2--;
            } else {
                flag = false;
                ind1++; // можно break, но вроде как это будет моветон, жду коммент, как лучше
                ind2--;
            }
        }
        return flag;
    }

    private static String incomingWord() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word: ");
        String userWord = input.next();
        input.close();

        return userWord;

    }
}