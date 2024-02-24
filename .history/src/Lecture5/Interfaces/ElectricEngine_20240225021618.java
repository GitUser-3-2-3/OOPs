package Lecture5.Interfaces;

/**
 * ElectricEngine
 */
public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Ele");
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