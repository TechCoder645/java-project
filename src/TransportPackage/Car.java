package TransportPackage;

public class Car extends Vehicle {
    public boolean hasAirConditioner;
    public String transmissionType; // "Auto", "Manual", etc.

    // 5 parameters wala constructor
    public Car(String name, String model, int noOfTyres, boolean hasAirConditioner, String transmissionType) {
        super(name, model, noOfTyres);
        this.hasAirConditioner = hasAirConditioner;
        this.transmissionType = transmissionType;
    }

    public void openTrunk() {
        System.out.println("Opening trunk of " + name + " " + model);
    }
}