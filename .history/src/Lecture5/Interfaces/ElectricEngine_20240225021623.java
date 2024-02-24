package Lecture5.Interfaces;

/**
 * ElectricEngine
 */
public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine starts");
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