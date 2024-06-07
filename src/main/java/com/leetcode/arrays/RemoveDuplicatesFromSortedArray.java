package com.leetcode.arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int start = 1;
        int duplicate = nums[0];
        while (j < nums.length) {
            if (nums[i] == duplicate && nums[j] != duplicate) {
                i++;
                nums[i] = nums[j];
                duplicate = nums[j];
                start++;
            }
            if (nums[i] != duplicate) {
                i++;
                start++;
            }
            j++;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums2 = new int[]{1, 2, 3, 3, 3, 3, 4, 4, 5, 5};
        int[] nums3 = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }
}
