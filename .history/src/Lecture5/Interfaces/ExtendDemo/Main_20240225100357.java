package Lecture5.Interfaces.ExtendDemo;

/**
 * Main
 */
public class Main implements B {

    // When a 
    @Override
    public void fun() {
        System.out.println("Implemented the method from Interface A");
    }

    @Override
    public void greet() {
        System.out.println("Implemented the method from Interface B");
    }
    
}