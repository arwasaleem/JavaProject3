package org.example.JavaProject1;

public class Q9 {
    public static void main(String[] args) {

        int[] number = {2, 5, 7, 4, 9, 10, 15};
        int largeNum1 = 0;
        int largeNum2 = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largeNum1) {
                largeNum2 = largeNum1;
                largeNum1 = number[i];
            }else if (number[i]>largeNum2){
                largeNum2=number[i];
            }

        }
        System.out.println(largeNum2);
    }
}
