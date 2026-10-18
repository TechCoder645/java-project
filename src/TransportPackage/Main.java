package TransportPackage;

public class Main {
    public static void main(String[] args) {
        // 1. Car Object
        Car c = new Car("Maruti", "800", 4, true, "Auto");
        System.out.println("--- Car Details ---");
        c.startEngine();
        c.openTrunk();
        c.stopEngine();

        System.out.println();

        // 2. Motorcycle Object
        Motorcycle bike = new Motorcycle("Royal Enfield", "Hunter 350", 2, true);
        System.out.println("--- Motorcycle Details ---");
        bike.startEngine();
        bike.kickStart();
        bike.stopEngine();
    }
}