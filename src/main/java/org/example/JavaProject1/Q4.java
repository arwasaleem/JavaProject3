package org.example.JavaProject1;

public class Q4 {
    public static void main(String[] args) {

        int[][] values = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int sumEven = 0;
        int sumOdd = 0;

        // Loop through each row
        for (int i = 0; i < values.length; i++) {

            for (int j = 0; j < values[i].length; j++) {

                if (values[i][j] % 2 == 0) {
                    sumEven = sumEven + values[i][j];
                } else {

                    sumOdd = sumOdd + values[i][j];
                }
            }

        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

    }
}
