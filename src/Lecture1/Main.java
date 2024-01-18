package Lecture1;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];

        Student parth = new Student();
        Student juhi = new Student("Juhi", 18);
        Student himanshu = new Student(18, "Himanshu", 10);

        parth.greeting();
        // juhi.changeName("Juhi");
        juhi.greeting();
        himanshu.greeting();

        // System.out.println(parth.rno);
        // System.out.println(parth.name);
        // System.out.println(parth.marks);

        System.out.println();
    }
}

// create a class for every single student
class Student {
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above properties object by object
    // we need one word to access every object
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }

    Student() {
        this("Parth", 32.3f);
    }

    Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    Student(int roll, String name, float marks) {
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }
}
