package org.example.JavaProject1;

public class Q7 {

    /* Write a Java Program to print the first 10 numbers of Fibonacci series. */
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        for (int i = 0; i < 10; i++) {
            int z = x + y;

            System.out.print(x + " ");
            x = y;
            y = z;
        }
    }
}
