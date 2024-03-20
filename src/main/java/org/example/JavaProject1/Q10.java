package org.example.JavaProject1;

public class Q10 {
    public static void main(String[] args) {
        int[] nums ={1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    System.out.println(nums[j]);
            }
        }
    }
}

