package Lecture5.Interfaces.ExtendDemo;

/**
 * NestedInterface
 */
public interface NestedInterface {
    /**
     * InnerNestedInterface
     */
    public interface InnerNestedInterface {
        boolean isOdd(int num);
    }
}

/**
 * InnerNestedInterface_1
 */
public class B implements NestedInterface.InnerNestedInterface{

    @Override
    public boolean isOdd(int num) {
        
    }
    
}