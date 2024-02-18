package Lecture3.Inheritance;

import java.util.ArrayList;

/**
 * BoxWeight
 */
public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    static void greeting() {
        System.out.println("Hi from BoxWeight");
        ArrayList<String> list = new ArrayList<>();
        list.set(0, "fine");
        list.set(1, "new String");
        list.get(0);
        list.ensureCapacity(0);
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // used to call the parent class constructor
        // used to initialize values present in the parent class constructor

        // refers to the weight variable in this class
        System.out.println(this.weight);

        // calls the parent class for weight variable
        System.out.println(super.weight);
        this.weight = weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double weight) {
        if (weight < 0) {
            weight = -1;
        }
        // if super is not mentioned it calls the default constructor of the parent
        // class
        this.weight = weight;
        for (int i = 0; i < 10; i++) {
            System.out.println("BoxWeight");
        }
    }
}