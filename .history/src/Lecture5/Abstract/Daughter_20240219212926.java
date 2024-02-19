package Lecture5.Abstract;

/**
 * Son
 */
public class Daughter extends Parent {

    Daughter(int age) {
        super(age);
        //TODO Auto-generated constructor stub
    }

    @Override
    void career() {
        System.out.println("I am going to be a Coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man");
    }

}