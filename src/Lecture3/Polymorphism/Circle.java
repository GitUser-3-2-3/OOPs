package Lecture3.Polymorphism;

/**
 * Circle
 */
public class Circle extends Shapes {
    // this will run when the obj of Circle is created.
    // Hence, it is overriding the area() method of Shapes class
    @Override
    void area() {
        System.out.println("Area of Circle is 3.14 * radius * radius");
    }
}