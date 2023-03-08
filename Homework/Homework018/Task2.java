package Homework.Homework.Homework018;

import java.io.FileWriter;

/**
 * Напишите метод, который составит строку, состоящую из 100 повторений слова
 * TEST и метод, который запишет эту строку в простой текстовый файл,
 * обработайте исключения.
 */

public class Task2 {
    public static void main(String[] args) {
        String testx100 = createString();
        writeToFile(testx100);
    }

    private static void writeToFile(String str) {

        try (FileWriter file = new FileWriter("file.txt")) {
            file.write(str);
            file.flush();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private static String createString() {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST ");
        }
        String str = sb.toString();

        return str;
    }
}
