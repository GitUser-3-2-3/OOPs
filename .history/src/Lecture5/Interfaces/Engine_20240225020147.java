package Lecture5.Interfaces;

/**
 * Engine
 */
public interface Engine {
    int PRICE = 1000;
    
    void start();
    void stop();
    void accelerate();

    int model = 100;
}