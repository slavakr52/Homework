package Homework.Homework024;

public class Program {

    public static void main(String[] args) {

        Cars lada = new Cars("Lada Granta", 86, 1.6, 1354889, "Drum", "Front-Wheel Drive", "Sedan", "Black", "Left");
        Price<Integer> ladaPrice = new Price<>(655900);
        Options<String, Boolean> ladaOptions = new Options<>("Air Conditioner", false);

        lada.getInfo();
        System.out.println("\nOptions: \n" + ladaOptions.getOptionName() + ": " + ladaOptions.getOptionPresence());
        System.out.println("\nPrice: " + ladaPrice.getPrice());
    }

}
