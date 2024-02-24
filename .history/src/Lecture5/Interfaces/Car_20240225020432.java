package Lecture5.Interfaces;

/**
 * Car
 */
public class Car implements Engine, Media, Brake {

    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
    
    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {

    }
    
}