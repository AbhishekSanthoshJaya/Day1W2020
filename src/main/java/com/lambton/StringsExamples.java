package com.lambton;

import java.util.Arrays;
import java.util.Scanner;

public class StringsExamples {

    public static void main(String[] args) {
/*
    String s1 = "Hello";
    String s2 = "World";
    String s3 = "Hello";
    String s4 = s1;

    String s5 = new String(s2);
    String s6 = new String();
    s6 = "World";
        String s7 = new String ( "Hello");
        System.out.println("S1 = " + s1);
        System.out.println("S2 = " + s2);
        System.out.println("S3 = " + s3);
        System.out.println("S4 = " + s4);
        System.out.println("S5 = " + s5);
        System.out.println("S6 = " + s6);

        if(s2 == s6)
        {
            System.out.println("s2(" + s2 + ") = s6(" + s6 + ")");
        } else {
            System.out.println("s2 (" + s2 + ") <> s6 (" + s6 + ")");
        }

        if (s2.equals(s6))
        {
            System.out.println("s2(" + s2+ ") equals s6 (" + s6 + ")");
        } else {
            System.out.println("s2(" + s2 + ") <> s6 (" + s6 +")");
        }
//Trying string handling functions

        int a = 100;
        int b = 200;
        int c = a + b;
        String str = String.format("%d + %d = %d", a, b, c);
        System.out.println(str);

        String betterString = String.join( "", "Welcome",  " to", " Lambton", " Toronto");
        System.out.println(betterString);

        char p = s1.;
        System.out.println(p);

*/
        StringExamples out = new StringsExamples();
        out.outputString("Welcome");
    }

    public void outputString(String name) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text: ");
        name = input.nextLine();

        int index_tracker = 0;

        for (int i = 0; i <= name.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(name.charAt(index_tracker));
                index_tracker++;

                if (index_tracker >= name.length()) {
                    System.out.print("");
                    return;
                }
            }
              /*  while (index_tracker <= name.length())
                {
                    System.out.print(name.charAt(index_tracker));
                    index_tracker ++;
                }
               */
        }
        System.out.println();
    }

}

