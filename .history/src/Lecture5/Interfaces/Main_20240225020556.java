package Lecture5.Interfaces;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Car car = new Car();
        car.start();
        car.stop();
        car.accelerate();
        car.brake();

        System.out.println();
    }
}