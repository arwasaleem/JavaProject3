package org.example.JavaProject1;

public class Q1 {
    public static void main(String[] args) {

        /* Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week. */

        int[] temps = {22, 25, 17, 19, 30, 21, 24};

        // Assume first temperature is both highest and lowest
        int max = temps[0];
        int min = temps[0];

        for (int t : temps) {
            if (t > max) {
                max = t;
            }
            if (t < min) {
                min = t;
            }
        }

        System.out.println("Highest Temperature of the Week: " + max + "°C");
        System.out.println("Lowest Temperature of the Week: " + min + "°C");
    }
}

