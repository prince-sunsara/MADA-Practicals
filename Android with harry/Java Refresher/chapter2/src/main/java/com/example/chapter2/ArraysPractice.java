package com.example.chapter2;

import java.util.ArrayList;

public class ArraysPractice {
    public static void main(String[] args) {
        int prince[] = {1, 2, 3, 4, 5};
        System.out.println(prince[0]);
        System.out.println(prince[1]);
        System.out.println(prince[2]);
        System.out.println(prince[3]);
        System.out.println(prince[4]);

        ArrayList al = new ArrayList();
        al.add(57);
        al.add("Prince");
        al.add(545454);
        for (Object o: al) {
            System.out.println("Object is : " + o);
        }
    }
}
