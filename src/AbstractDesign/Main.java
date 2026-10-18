package AbstractDesign;
// This is old method
//// it  is abstract concept
//abstract class Bird {
//    abstract  void fly();
//    abstract void eat();
//}
//// it is implementation of abstract
//class Sparrow extends Bird{
//    @Override
//    void fly(){
//        System.out.println("Sparrow flying");
//    }
//    @Override
//    void eat(){
//        System.out.println("Sparrow eating");
//    }
//
//}
//
// public class Main {
//    public static void main(String[] args){
////         Bird b= new Bird();   it cannot implement because we cannot create it.
//        Bird b= new Sparrow(); // it is work because we use it as a subclass . sparrow is a class
//         b.eat();
//         b.fly();
//    }
//}

    // this is new method
// it  is abstract concept
abstract class Bird {
    abstract  void fly();
    abstract void eat();
}
// it is implementation of abstract
class Sparrow extends Bird{
    @Override
    void fly(){
        System.out.println("Sparrow flying");
    }
    @Override
    void eat(){
        System.out.println("Sparrow eating");
    }

}

public class Main {
    public static void main(String[] args){
//         Bird b= new Bird();   it cannot implement because we cannot create it.
        Bird b= new Sparrow(); // it is work because we use it as a subclass . sparrow is a class
        b.eat();
        b.fly();
    }
}
