package org.example.JavaProject1;

public class Q3 {

    /* Create a 2D array or integer type where you will store odd and even numbers.
    Develop a program which will identify/print the even numbers only. */


    public static void main(String[] args) {

        int[][] numbers = {
                {10, 11, 12, 13},
                {14, 15, 16, 17},
                {18, 19, 20, 21},
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (numbers[i][j] % 2 == 0) { // this is to choose the even numbers only
                    System.out.print(numbers[i][j] + " ");
                }
            }

            System.out.println();

        }

    }
}
