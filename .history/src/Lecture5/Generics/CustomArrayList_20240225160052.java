package Lecture5.Generics;

import java.util.ArrayList;

/**
 * CustomArrayList
 */
public class CustomArrayList {
    public static void main(String[] args) {
        System.out.println();

        ArrayList list = new ArrayList();
        list.add(0, list);
    }
}