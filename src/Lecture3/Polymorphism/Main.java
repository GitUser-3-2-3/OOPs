package Lecture3.Polymorphism;

/**
 * Main
 */
public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println();
        
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Square square = new Square();
        
        circle.area();

        System.out.println();
    }
}