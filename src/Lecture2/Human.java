package Lecture2;

/**
 * Human
 */
public class Human {
    int age;
    String name;
    float salary;
    boolean married;
    static long population;

    // a constructor with parameters
    Human(int age, String name, float salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}