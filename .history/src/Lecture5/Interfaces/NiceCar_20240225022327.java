package Lecture5.Interfaces;

/**
 * NiceCar
 */
public class NiceCar {
    @SuppressWarnings("unused")

    private Engine engine;
    private mediaPlayer;

    public NiceCar(Engine engine) {
        engine = new ElectricEngine();
    }
}