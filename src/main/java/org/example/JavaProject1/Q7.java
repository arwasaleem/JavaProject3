package org.example.JavaProject1;

public class Q7 {
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
