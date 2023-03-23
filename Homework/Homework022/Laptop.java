package Homework022;

/**
 * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * 2. Создать множество ноутбуков (ArrayList).
 * 3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям. Например, спросить у пользователя минимальный размер оперативной
 * памяти или конкретный цвет. Выводить только те ноутбуки, что соответствуют
 * условию
 */
public class Laptop {

    String brand;
    String model;
    String diagonal;
    String ram;
    String ssd;
    String price;

    public Laptop(String brand, String model, String diagonal, String ram, String ssd, String price) {
        this.brand = brand;
        this.model = model;
        this.diagonal = diagonal;
        this.ram = ram;
        this.ssd = ssd;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", model=" + model + ", diagonal=" + diagonal + ", ram=" + ram + ", ssd="
                + ssd + ", price=" + price + "]";
    }

    public void showInfo() {
        System.out.println("\nBrand: " + brand
                + "\nModel: " + model
                + "\nScreen size: " + diagonal + "inch"
                + "\nRAM: " + ram + " GB"
                + "\nMemory (SSD): " + ssd + " GB");
    }

    public void showBrandAndModel() {
        System.out.println(brand + " " + model);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public String getRam() {
        return ram;
    }

    public String getSsd() {
        return ssd;
    }

    public String getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}