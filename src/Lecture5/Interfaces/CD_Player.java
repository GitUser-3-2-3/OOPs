package Lecture5.Interfaces;

/**
 * CD_Player
 */
public class CD_Player implements Media {

    @Override
    public void start() {
        System.out.println("Music starts");
    }

    @Override
    public void stop() {
        System.out.println("Music stops");
    }

    
}