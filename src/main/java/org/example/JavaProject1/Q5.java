package org.example.JavaProject1;

public class Q5 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println("Before swapping: x = " + x + ", y = " + y);

        // Swap numbers without a temporary variable using XOR
        x = x + y; // 30 = 10 + 20
        y = x - y; // 10 = 30 - 20
        x = x - y; // 20 = 30 - 10

        System.out.println("After swapping: x = " + x + ", y = " + y);

    }
}
