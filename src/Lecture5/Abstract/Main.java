package Lecture5.Abstract;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Parent son = new Son(32);
        son.career();
        son.normal();

        Parent daughter = new Daughter(21);
        daughter.career();

        System.out.println();
    }
}