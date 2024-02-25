package Lecture5.Interfaces.ExtendDemo;

/**
 * A
 */
public interface A {
    void fun();

    // static interface methods should always have a body
    static void staticMethod() {
        System.out.println("Hey! I have a body cause I am a static method");
    }
}