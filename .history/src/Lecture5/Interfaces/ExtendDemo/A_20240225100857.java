package Lecture5.Interfaces.ExtendDemo;

/**
 * A
 */
public interface A {
    void fun();

    default void great() {
        System.out.println("this laptop is great");
    }
}