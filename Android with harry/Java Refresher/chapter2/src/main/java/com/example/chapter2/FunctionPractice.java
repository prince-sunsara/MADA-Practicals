package com.example.chapter2;


public class FunctionPractice {
    public static double avg(int a, int b, int c){
        return (a+b+c)/3.0;
    }
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        System.out.println(avg(a,b,c));
    }
}
