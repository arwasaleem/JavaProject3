package org.example.JavaProject1;

public class Q2 {

    /* Create an array of integer values. After the array is created,
    calculate the sum of all stored elements in that array. */

    public static void main(String[] args) {

        int[] numbers = {10, 30, 50, 80, 40, 90};
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
