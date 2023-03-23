package Homework022;

/**
 * Task1
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
        System.out.println("Brand: " + brand
                + "\nModel: " + model
                + "\nScreen size: " + diagonal + "inch"
                + "\nRAM: " + ram + " GB"
                + "\nMemory (SSD): " + ssd + " GB");
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