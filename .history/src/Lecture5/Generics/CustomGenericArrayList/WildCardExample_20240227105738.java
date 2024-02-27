package Lecture5.Generics.CustomGenericArrayList;

import java.util.Arrays;
import java.util.List;

/**
 * CustomArrayList
 */
public class WildCardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value) {
        if (isFull()) {
            resize();
        }
        data[size++] = value;
    }

    public void getList(List<Number> list) {
        // here you can only pass number type
    }

    public void getListAndTypes(List<? extends Number> list) {
        // here you can only pass number type
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        @SuppressWarnings("unchecked")
        T removed = (T) (data[--size]);
        return removed;
    }

    @SuppressWarnings("unchecked")
    public T getIndex(int index) {
        return (T) (data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList: " + Arrays.toString(data) + ", size: " + size;
    }

    public static void main(String[] args) {
        System.out.println();

        WildCardExample<Integer> list = new WildCardExample<>();
        list.add(32);
        list.add(43);

        // WildCardExample<String> list2 = new WildCardExample<>();
        // list2.add("Kaa ho?");
        // list2.add("Sab Theek?");
        // System.out.println(list2);

        System.out.println();
    }
}