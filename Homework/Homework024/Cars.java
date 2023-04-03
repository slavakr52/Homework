package Homework.Homework024;

public class Cars extends CarInfo {

    String name;

    public Cars(String name, int horsePower, double engineCapacity, int engineNumber, String brakeType,
            String driveType,
            String bodyType, String interiorColor, String steeringWheelSide) {
        super(horsePower, engineCapacity, engineNumber, brakeType, driveType, bodyType, interiorColor,
                steeringWheelSide);
        this.name = name;
    }

    void getName() {
        System.out.println(name);
    }

    @Override
    public void getInfo() {
        System.out.println("Car Info: ");
        getName();
        getEngineCapacity();
        getHorsePower();
        getEngineNumber();
        getBodyType();
        getDriveType();
        getBrakeType();
        getSteeringWheelSide();
        getInteriorColor();

    }

}
