package Homework019;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и
 * среднее арифметическое из этого списка.
 */
public class Task2 {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Double x = Math.random() * 10;
            Integer number = x.intValue();
            array.add(number);
        }
        System.out.println(array);

        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        double average = sum / array.size();

        System.out.printf("Max value: %d, min value: %d, average: %.2f", (Collections.max(array)),
                (Collections.min(array)), average);

    }
}