package org.example.JavaProject1;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {


        int num = 44;
        boolean isPrime = true;

        if (num < 2) {
            System.out.println(num + " is not a prime number.");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) { // this equation is for prime numbers only
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }

        }
    }
}

