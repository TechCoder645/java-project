package TransportPackage;

// Child Class / Subclass
public class Motorcycle extends Vehicle {
    public boolean hasABS;

    public Motorcycle(String name, String model, int noOfTyres, boolean hasABS) {
        // Parent class (Vehicle) ke constructor ko call karna
        super(name, model, noOfTyres);
        this.hasABS = hasABS;
    }

    // Motorcycle ka apna specific method
    public void kickStart() {
        System.out.println("Kick-starting " + name + " " + model);
    }
}