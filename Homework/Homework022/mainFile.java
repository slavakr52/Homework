package Homework022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainFile {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Lenovo", "A300", "13", "8", "256", "46500");
        Laptop laptop2 = new Laptop("ASUS", "X700", "13", "16", "512", "52800");
        Laptop laptop3 = new Laptop("HP", "2000", "15", "8", "1024", "65500");
        Laptop laptop4 = new Laptop("Lenovo", "L20", "17", "8", "1024", "69800");
        Laptop laptop5 = new Laptop("Acer", "AC900", "17", "16", "1024", "72900");
        Laptop laptop6 = new Laptop("Apple", "MacBook Air", "13", "8", "128", "107900");
        Laptop laptop7 = new Laptop("Apple", "MacBook Pro", "15", "16", "512", "156900");
        Laptop laptop8 = new Laptop("Lenovo", "LP200", "17", "8", "512", "61900");
        Laptop laptop9 = new Laptop("ASUS", "GT550", "17", "8", "512", "59900");
        Laptop laptop10 = new Laptop("Acer", "AC770", "13", "16", "512", "51900");

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);
        laptopList.add(laptop5);
        laptopList.add(laptop6);
        laptopList.add(laptop7);
        laptopList.add(laptop8);
        laptopList.add(laptop9);
        laptopList.add(laptop10);

        System.out.println("Available laptops:\n");
        for (int i = 0; i < laptopList.size(); i++) {
            laptopList.get(i).showBrandAndModel();
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the minimum amount of SSD: ");
        Integer userInput = input.nextInt();
        input.close();

        int check = 0;
        for (int i = 0; i < laptopList.size(); i++) {
            Integer memory = Integer.parseInt(laptopList.get(i).getSsd());
            if (memory >= userInput){
                laptopList.get(i).showInfo();
                check++;
            }
        }
        if (check == 0){
            System.out.println("\nNo results found");
        }

    }
}
