package Homework.Homework.Homework017;

import java.util.Arrays;

/**
 * Дан массив nums = [3,2,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
 * конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть
 * отличны от заданного, а остальные - равны ему.
 */

public class Task3 {

    public static void main(String[] args) {

        int[] nums = { 2, 2, 3, 2, 3, 1, 7, 3, 2, 5, 3, 2, 2, 3 };
        int val = 3;

        System.out.println(Arrays.toString(moveValuesToArrayEnd(nums, val)));

    }

    private static int[] moveValuesToArrayEnd(int[] array, int value) {
        int ind1 = 0;
        int ind2 = array.length - 1;
        while (ind1 < ind2) {
            while (ind1 < ind2 && array[ind2] == value) {
                ind2--;
            }
            if (array[ind1] == value) {
                replaceElements(array, ind1, ind2);
            }
            ind1++;
        }
        return array;
    }

    private static int[] replaceElements(int[] array, int ind1, int ind2) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
        return array;
    }
}