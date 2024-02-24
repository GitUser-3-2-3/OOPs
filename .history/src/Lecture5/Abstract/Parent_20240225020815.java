package Lecture5.Abstract;

/**
 * Parent
 */
public abstract class Parent {
    int age;

    Parent(int age) {
        this.age = age;
    }

    public void normal() {
        System.out.println("Normal Method");
    }

    abstract void career();
    abstract void partner();
}