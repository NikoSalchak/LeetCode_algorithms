package com.leetcode.arrays;
/**
* метод должен убрать из массива элементы равные val и вернуть длину массива без элементов равных val
* */

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int start = 0;
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[i] == val && nums[j] != val) {
                nums[i] = nums[j];
                nums[j] = val;
            }
            if (nums[i] != val) {
                i++;
            }
            j++;
        }
        while (start < nums.length) {
            if (nums[start] != val) {
                k++;
            }
            start++;
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int[] nums3 = new int[]{1};
        int val3 = 1;
        System.out.println(removeElement(nums2, val2));
    }
}
