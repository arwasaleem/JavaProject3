package org.example.JavaProject1;

public class Q8 {
    public static void main(String[] args) {

        int[] number = {12, 24, 36, 48, 60, 72, 84, 96, 120};

        int max = number[0];
        int min = number[0];

        for (int n : number) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println("Minimum number : " + min);
        System.out.println("Maximum number : " + max);

    }

    }

