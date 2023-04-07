package Homework.Homework024;
/*
 * Данный абстрактный класс описывает основные характеристики автомобиля
 */
public abstract class CarInfo implements I_AllInfo {

    int horsePower;
    double engineCapacity;
    int engineNumber;
    String brakeType;
    String driveType;
    String bodyType;
    String interiorColor;
    String steeringWheelSide;

    public CarInfo(int horsePower, double engineCapacity, int engineNumber, String brakeType, String driveType,
            String bodyType, String interiorColor, String steeringWheelSide) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
        this.engineNumber = engineNumber;
        this.brakeType = brakeType;
        this.driveType = driveType;
        this.bodyType = bodyType;
        this.interiorColor = interiorColor;
        this.steeringWheelSide = steeringWheelSide;
    }

    @Override
    public void getInfo() {
        System.out.println("Info");
    }

    @Override
    public double getEngineCapacity() {
        return engineCapacity;

    }

    @Override
    public int getEngineNumber() {
        return engineNumber;

    }

    @Override
    public int getHorsePower() {
        return horsePower;

    }

    @Override
    public String getBrakeType() {
        return brakeType;

    }

    @Override
    public String getDriveType() {
        return driveType;

    }

    @Override
    public String getBodyType() {
        return bodyType;

    }

    @Override
    public String getInteriorColor() {
        return interiorColor;

    }

    @Override
    public String getSteeringWheelSide() {
        return steeringWheelSide;

    }

}
