package Homework.Homework.Homework017;

// Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class Task1 {
    public static void main(String[] args) {

        int[] array = { 4, 6, 3, 11, 56, 32, 467, 34, 434, 233 };

        printMaxAndMinValue(array);
    }

    private static void printMaxAndMinValue(int[] array) {
        int minValue = array[0];
        int maxValue = array[0];
        for (int ind = 0; ind < array.length; ind++) {
            if (array[ind] > maxValue) {
                maxValue = array[ind];
            }
            if (array[ind] < minValue) {
                minValue = array[ind];
            }
        }
        System.out.printf("Минимальный элемент = %d, максимальный элемент = %d", minValue, maxValue);
    }
}
