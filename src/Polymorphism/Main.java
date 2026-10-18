package Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2, 3));
//        System.out.println(c.add(2, 3, 4));

        // runtime polymorphism
        Circle c = new Circle();
        c.draw();
        doDrawingStuff(c);

        Rectangle r = new Rectangle();
        r.draw();
        doDrawingStuff(r); // Dynamic method dispatch works here as well(upcasting)
    }

    // Moved outside of main() into the class body
    public static void doDrawingStuff(Shape s) {
        s.draw(); // Dynamic method dispatch / polymorphism
    }
}