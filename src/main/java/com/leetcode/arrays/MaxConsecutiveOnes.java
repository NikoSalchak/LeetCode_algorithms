package com.leetcode.arrays;

public class MaxConsecutiveOnes {
    public static int getMaxConsecutiveOnes(int[] nums) {
        int rsl = 0;
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                length++;
                rsl = Math.max(length, rsl);
            } else {
                length = 0;
            }
        }
        return rsl;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 1, 1, 0, 1};
        int rsl = getMaxConsecutiveOnes(nums);
        System.out.println(rsl);
    }
}
