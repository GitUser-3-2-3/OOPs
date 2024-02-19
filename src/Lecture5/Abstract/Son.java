package Lecture5.Abstract;

/**
 * Son
 */
public class Son extends Parent {

    Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Footballer");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }

    
}