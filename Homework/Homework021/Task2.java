package Homework021;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Написать программу, которая найдёт и выведет повторяющиеся имена с
 * количеством повторений. Отсортировать по убыванию популярности.
 */
public class Task2 {

    public static void main(String[] args) {

        Map<String, Integer> nameCount = new HashMap<>();

        String listOfEmployees = "Иван Иванов "
                + "Светлана Петрова " + "Кристина Белова "
                + "Анна Мусина " + "Анна Крутова "
                + "Иван Юрин " + "Петр Лыков "
                + "Павел Чернов " + "Петр Чернышов "
                + "Мария Федорова " + "Марина Светлова "
                + "Мария Савина " + "Мария Рыкова "
                + "Марина Лугова " + "Анна Владимирова "
                + "Иван Мечников " + "Петр Петин "
                + "Иван Ежов ";

        String[] splitList = listOfEmployees.split(" ");

        for (int i = 0; i < splitList.length; i += 2) {
            if (nameCount.containsKey(splitList[i])) {
                nameCount.replace(splitList[i], nameCount.get(splitList[i]) + 1);
            } else {
                nameCount.put(splitList[i], 1);
            }
        }

        int maxValue = 0;
        for (int value : nameCount.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        Map<String, Integer> sortedNameCount = new LinkedHashMap<>();

        for (int i = maxValue; i != 0; i--) {
            for (Map.Entry<String, Integer> name : nameCount.entrySet()) {
                String nameKey = name.getKey();
                if (nameCount.get(nameKey) == i) {
                    sortedNameCount.put(nameKey, nameCount.get(nameKey));
                }
            }
        }

        System.out.println(sortedNameCount);
    }
}