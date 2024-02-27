package Lecture5.Generics.CustomGenericArrayList;

import java.util.Arrays;

/**
 * CustomArrayList
 */
public class CustomArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int getIndex(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList: " + Arrays.toString(data) + ", size: " + size;
    }
}