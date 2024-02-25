package Lecture5.Interfaces.ExtendDemo;

/**
 * NestedInterface
 */
public interface NestedInterface {
    /**
     * InnerNestedInterface
     */
    private interface InnerNestedInterface {
        boolean isOdd(int num);
    }
}

/**
 * InnerNestedInterface_1
 */
class B implements NestedInterface.InnerNestedInterface{

    @Override
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }
    
}

/**
 * Main
 */
class NewMain {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.isOdd(5));
    }   
}