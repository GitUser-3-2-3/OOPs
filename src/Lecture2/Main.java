package Lecture2;

/**
 * Main
 */
public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println();

        // Human parth = new Human(18, "Parth", 100000, false);
        // Human juhi = new Human(18, "Juhi", 100000, false);
        // Human himanshu = new Human(18, "Himanshu", 100000, false);

        // System.out.println(Human.population);
        // System.out.println(Human.population);

        // Main obj1 = new Main();
        // obj1.fun2();

        // System.out.println();

        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();

    }

    // static methods are not dependent on objects
    static void fun() {
        /*
         * newGreeting(); // you can't use this because this requires an instance of the
         * class
         * // but the function you are calling does not depend on the instance
         */
        // you can call newGreeting now because you are referring to the class
        Main obj = new Main();
        obj.newGreeting();
    }

    void fun2() {
        newGreeting();
    }

    // we know that something that is not static belongs to the object
    private void newGreeting() {
        System.out.println("Hello! My name is Parth.");
    }
}