package Lecture4;

/**
 * A
 */
public class A {
    protected int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}