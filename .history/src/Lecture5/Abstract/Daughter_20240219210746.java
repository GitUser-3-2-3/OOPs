package Lecture5.Abstract;

/**
 * Son
 */
public class n extends Parent {

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name + " in the future.");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " and she is " + age + " years old.");
    }

}