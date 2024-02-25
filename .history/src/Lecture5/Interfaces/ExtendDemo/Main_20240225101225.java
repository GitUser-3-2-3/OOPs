package Lecture5.Interfaces.ExtendDemo;

/**
 * Main
 */
public class Main implements B {

    // When a Interface extends another interface you have to implement all the methods from the extended interface
    @Override
    public void fun() {
        System.out.println("Implemented the method from Interface A");
    }

    @Override
    public void greet() {
        System.out.println("Implemented the method from Interface B");
    }
    
    public static void main(String[] args) {
        System.out.println();

        A obj = new A
    }
}