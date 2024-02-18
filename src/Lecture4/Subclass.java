package Lecture4;

/**
 * Subclass
 */
public class Subclass extends A {

    public Subclass(int num, String name, int[] arr) {
        super(num, name, arr);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println();

        Subclass sub = new Subclass(53, "Parth", null);
        Subclass sub2 = new Subclass(53, "Juhi", null);
        sub.num = 10;
        System.out.println();
    }
}