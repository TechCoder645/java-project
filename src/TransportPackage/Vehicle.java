package TransportPackage;
// inheritance code
public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;
    Vehicle(String name, String model, int noOfTyres){
        this.name= name;
        this.model=model;
        this.noOfTyres= noOfTyres;
    }
    void startEngine(){
        System.out.printf("Engine is starting of %s: %s\n",name,model);
        //System.out.println() vs printf(): println() format specifiers (%s) ko support nahi karta.
        // String formatting ke liye System.out.printf() use hota hai.
    }

    void stopEngine(){
        System.out.printf("Engine is stopping of %s: %s\n",name,model);
    }
}
