package com.leetcode.arrays;

import java.util.Arrays;

/**
 * метод данного класса принимает в параметры отсортированный массив и возвращает отсортированный массив
 * с возведенными в квадрат элементами
 */
public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int n = nums.length;
        int[] rsl = new int[n];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                rsl[i] = nums[left] * nums[left];
                left++;
            } else {
                rsl[i] = nums[right] * nums[right];
                right--;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] rsl = sortedSquares(nums);
        System.out.println(Arrays.toString(rsl));
        int[] nums2 = new int[]{-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(nums2)));
    }
}
