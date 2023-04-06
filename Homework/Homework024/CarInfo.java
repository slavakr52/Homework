package Homework.Homework024;

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
    public void getEngineCapacity() {
        System.out.println(engineCapacity);

    }

    @Override
    public void getEngineNumber() {
        System.out.println(engineNumber);

    }

    @Override
    public void getHorsePower() {
        System.out.println(horsePower);

    }

    @Override
    public void getBrakeType() {
        System.out.println(brakeType);

    }

    @Override
    public void getDriveType() {
        System.out.println(driveType);

    }

    @Override
    public void getBodyType() {
        System.out.println(bodyType);

    }

    @Override
    public void getInteriorColor() {
        System.out.println(interiorColor);

    }

    @Override
    public void getSteeringWheelSide() {
        System.out.println(steeringWheelSide);

    }

}
