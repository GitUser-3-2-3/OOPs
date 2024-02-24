package Lecture5.Interfaces;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Car car = new Car();

        car.start();
        car.brake();
        car.stop();
        car.accelerate();

        Media media = car;

        System.out.println();
    }
}