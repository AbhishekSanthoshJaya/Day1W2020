package com.lambton;

public class FirstExample

{
    public static void main(String[] args) {

        System.out.println("Welcome to JAVA programming");

// Day2 Code Starts here
        int a = 100;
        int b;
        b = 200;
        int c = a + b;

        System.out.println("Sum = " + (a + b));

        short x = 27671;
        System.out.println(Short.MAX_VALUE);

        long y = 500;
        System.out.println(y);
        System.out.println(Long.MAX_VALUE);

        float f1 = (float) 1000.00;
        double f2 = 1000.40D;
        System.out.println("F1 =" + f1);
        System.out.println("F2 =" + f2);

        int z = (int) (10.0F / 3);
        float l =  (float) 10/ 3;

        System.out.println("z =" + z);
        System.out.println("l =" + l);

        int x1 = 1_00_00/10;
        System.out.print("X1 = "+ x1);
    }
}
