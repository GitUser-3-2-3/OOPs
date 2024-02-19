package Lecture5.Abstract;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Parent son = new Son();
        son.career();
        son.normal();

        Parent daughter = new Daughter();
        daughter.career();

        System.out.println();
    }
}