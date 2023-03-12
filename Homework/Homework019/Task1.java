package Homework019;

import java.util.ArrayList;

/**
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 * (в языке уже есть что-то готовое для этого)
 */
public class Task1 {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Double x = Math.random() * 10;
            Integer number = x.intValue();
            array.add(number);
        }
        System.out.println(array);

        array.removeIf(el -> el % 2 == 0);

        System.out.println(array);
    }
}
