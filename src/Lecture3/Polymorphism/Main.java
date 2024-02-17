package Lecture3.Polymorphism;

/**
 * Main
 */
public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        
        shape.area();
    }
}