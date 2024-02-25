package Lecture5.Interfaces.ExtendDemo;

/**
 * Main
 */
public class Main implements B {

    @Override
    public void fun() {
        System.out.println("Implemented the method from Interface A");
    }

    @Override
    public void greet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greet'");
    }
    
}