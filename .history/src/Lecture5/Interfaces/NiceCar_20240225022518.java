package Lecture5.Interfaces;

/**
 * NiceCar
 */
public class NiceCar {

    private Engine engine;
    private Media mediaPlayer = new CD_Player();

    public NiceCar() {
        engine = new ElectricEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerate() {
        engine.accelerate();
    }
}