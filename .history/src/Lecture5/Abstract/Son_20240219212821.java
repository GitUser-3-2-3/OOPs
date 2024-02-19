package Lecture5.Abstract;

/**
 * Son
 */
public class Son extends Parent {

    Son(int age) {
        super(age);
        //TODO Auto-generated constructor stub
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