package Lecture5.Interfaces;

/**
 * Car
 */
public class Car implements Engine, Media, Brake {

    @Override
    public void brake() {

    }

    @Override
    public void start() {
    
    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accelerate'");
    }
    
}