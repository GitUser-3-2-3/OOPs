package Lecture5.Abstract;

/**
 * Son
 */
public class Son extends Parent {

    @Override
    void career(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'career'");
    }

    @Override
    void partner(String name, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'partner'");
    }

}