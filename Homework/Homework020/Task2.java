
package Homework020;

import java.util.LinkedList;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
 * вернет “перевернутый” список.
 */

public class Task2 {

    public static void main(String[] args) {

        LinkedList<String> mainList = new LinkedList<>();
        mainList.add("one");
        mainList.add("two");
        mainList.add("three");

        System.out.println(mainList);

        LinkedList<String> reverseList = new LinkedList<>();
        for (int i = 0; i < mainList.size(); i++) {
            reverseList.addFirst(mainList.get(i));
        }
        System.out.println(reverseList);
    }
}