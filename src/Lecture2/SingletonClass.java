package Lecture2;

/**
 * SingletonClass
 */
public class SingletonClass {
    private SingletonClass() {

    }

    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        // Check whether 1 object is only created or not
        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }
}