package Homework.Homework024;
/*
 * Данный класс добавляет название автомобиля к конструктору класса CarInfo и
 * по новому описывает метод getInfo
 * Экземпляры автомобилей создаются на базе данного класса
 */
public class Cars extends CarInfo {

    String name;

    public Cars(String name, int horsePower, double engineCapacity, int engineNumber, String brakeType,
            String driveType,
            String bodyType, String interiorColor, String steeringWheelSide) {
        super(horsePower, engineCapacity, engineNumber, brakeType, driveType, bodyType, interiorColor,
                steeringWheelSide);
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public void getInfo() {
        System.out.println("Car name: " + getName()
                + "\nEngine capacity: " + getEngineCapacity()
                + "\nHorse power: " + getHorsePower()
                + "\nEngine number: " + getEngineNumber()
                + "\nBody type: " + getBodyType()
                + "\nDrive type: " + getDriveType()
                + "\nBrake type: " + getBrakeType()
                + "\nSteering wheel side: " + getSteeringWheelSide()
                + "\nInterior color: " + getInteriorColor());

    }

}
