package Lecture5.Interfaces;

/**
 * NiceCar
 */
public class NiceCar {

    private Engine engine;
    private Media mediaPlayer = new ;

    public NiceCar(Engine engine) {
        engine = new ElectricEngine();
    }
}