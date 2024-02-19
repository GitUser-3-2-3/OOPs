package Lecture5.Abstract;

/**
 * Son
 */
public class Son extends Parent {

    @Override
    void career() {
        System.out.println("I am going to be a Footballer");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " and she is " + age + " years old.");
    }

}