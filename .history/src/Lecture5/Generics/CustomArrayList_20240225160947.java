package Lecture5.Generics;

import java.util.ArrayList;

/**
 * CustomArrayList
 */
public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
    }

    private boolean isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    private void resize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resize'");
    }

    public static void main(String[] args) {
        System.out.println();

        ArrayList list = new ArrayList<>();

        System.out.println();
    }
}