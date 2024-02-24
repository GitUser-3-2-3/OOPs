package Lecture5.Interfaces;

/**
 * Car
 */
public class Car implements Engine, Media, Brake {

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'brake'");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public void accelerate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accelerate'");
    }
    
}