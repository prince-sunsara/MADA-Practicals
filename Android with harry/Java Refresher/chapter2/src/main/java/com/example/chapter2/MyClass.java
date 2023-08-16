package com.example.chapter2;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello Prince...");
        String name = "This is my name";
        System.out.println(name);
        classX x = new classX();
        x.method1();
//      inheritance:  classEx have its own and also one more method extended from classX
        classEx ex = new classEx();
        ex.method2();
        ex.method1();
    }
}