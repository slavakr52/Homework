package Homework019;

import java.util.ArrayList;

/**
 * Создать список типа ArrayList<String>. Поместить в него как строки, так и
 * целые числа. Пройти по списку, найти и удалить целые числа.
 */
public class Task3 {

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<String>();
        str.add("word");
        str.add("string");
        str.add("2");
        str.add("hello");
        str.add("5");

        System.out.println(str);

        str.removeIf(el -> numberChecking(el) == true);

        System.out.println(str);

    }

    private static boolean numberChecking(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}