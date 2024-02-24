package Lecture3.Inheritance;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        // Box box = new Box(11.2, 32.11, 19.33);
        // System.out.println(box.h + " " + box.l + " " + box.w);

        // BoxWeight box = new BoxWeight();
        // BoxWeight box2 = new BoxWeight(11.0, 21.12, 14.9, 22.1);
        // System.out.println(box.h);
        // System.out.println(box2.h);

        BoxPrice box = new BoxPrice(12.4, 3.44, 21.33);
        System.out.println(box.weight);
        BoxWeight boxWeight = new BoxWeight(11.4, 13, 19.6, 12.2);
        System.out.println(boxWeight.);

        System.out.println();
    }
}
