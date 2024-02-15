package Lecture2;

/**
 * InnerClass
 */
public class InnerClass {
    static class Test {
        String name;

        Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test test1 = new Test("Parth");
        Test test2 = new Test("Juhi");

        System.out.println(test1.name);
        System.out.println(test2.name);
    }
}
