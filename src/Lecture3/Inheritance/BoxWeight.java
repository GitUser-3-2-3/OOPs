package Lecture3.Inheritance;

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
        // if super is not mentioned it calls the default constructor of the parent class
        this.weight = weight;
        for (int i = 0; i < 10; i++) {
            System.out.println("BoxWeight");
        }
    }
}