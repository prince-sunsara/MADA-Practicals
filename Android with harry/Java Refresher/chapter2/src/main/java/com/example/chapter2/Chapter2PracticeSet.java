package com.example.chapter2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Chapter2PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        multiplication table of a number.
//        int num = 10;
//        for (int i = 1; i <= 10; i++){
//            System.out.println(num + "x" + i + "=" + (i*num));
//        }


//        add two number.
//        int a=10;
//        int b=20;
//        System.out.println(a+b);

//        Search day by user enter number.
//        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//
//        System.out.println("Enter your choise \n");
//        int day = sc.nextInt();
//        day = day%7;
//        System.out.println(days[day]);


//        write a program to calculate tax on a given income considering indian laws.
//        0 to 250,000	- 0%
//        250,000 to 500,000	- 5%
//        500,000 to 1,000,000 - 20%
//        1,000,000 to above - 30%

//        double tax = 0;
//        System.out.println("Enter your income: \n");
//        double income = sc.nextDouble();
//        double income  = 250100;
//        if (income >= 0 && income < 250000) {
//            System.out.println("Your tax is " + tax);
//        } else if (income >= 250000 && income <500000) {
//            tax = 0 + ((income - 250000)*5)/100;
//            System.out.println("Your tax is " + tax);
//        } else if (income >= 500000 && income < 1000000) {
//            tax = 0 + (income - 250000)*0.05 + (income - 500000)*0.2;
//            System.out.println("Your tax is " + tax);
//        } else {
//            tax = 0 + (income - 250000)*0.05 + (income - 500000)*0.2 + (income - 1000000)*0.3;
//            System.out.println("Your tax is " + tax);
//        }


//        write a java program to sum first n even numbers using for loops.
//        int sum  = 0;
//        int enterYourChoice = 10;
//        for(int i = 0; i <= enterYourChoice; i++) {
//            if(i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);


//        write a program to print a following pattern
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *
        for(int i = 0; i < 5; i++){
            // print spaces
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
