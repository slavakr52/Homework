package Homework021;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными
 * числами от 0 до 1000
 * 2. Создайте метод, в который передайте заполненный массив и с помощью Set
 * вычислите процент уникальных значений по формуле:
 * процент уникальных чисел = кол-во ун. чисел * 100 / общее кол-во чисел
 */
public class Task0 {

    public static void main(String[] args) {
        List<Integer> array = createRandomArray(1000, 1000);
        percentOfUnicueNumbers(array);
    }

    private static void percentOfUnicueNumbers(List<Integer> array) {
        Set<Integer> set = new HashSet<>(array);
        double percent = set.size() * 100.0 / array.size();
        System.out.printf("Percentage of unicue numbers: %.1f", percent);
    }

    private static List<Integer> createRandomArray(int count, int maxValue) {
        Random rnd = new Random();
        List<Integer> array = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            array.add(rnd.nextInt(maxValue));
        }
        return array;
    }
}