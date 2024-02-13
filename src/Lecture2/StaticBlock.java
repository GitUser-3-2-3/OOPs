// this is to show initialization of static variable
package Lecture2;

/**
 * StaticInt
 */
public class StaticBlock {
    static int a = 10;
    static int b;

    // will only run once, when the first object is created i.e. when the class is
    // loaded
    static {
        System.out.println("I am in static block");
        b = a * 5;
        int a = 11;
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Value of a: " + a + " " + "Value of b: " + b);
        System.out.println("value of a: " + StaticBlock.a + " " + "Value of b: " + StaticBlock.b);

        System.out.println();
    }
}