package com.leetcode.arrays;

/**
 * метод класса возвращает true если в массиве arr[i] == arr[j] * 2 где i != j
 */
public class CheckIfNAndItsDoubleExists {
    public static boolean checkIfExist(int[] arr) {
        boolean rsl = false;
        int start = 0;
        int j = 0;
        while (start < arr.length) {
            if (arr[start] == arr[j] * 2 && start != j) {
                rsl = true;
                break;
            } else {
                j++;
            }
            if (j == arr.length) {
                start++;
                j = 0;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, 5, 3};
        int[] arr2 = new int[]{3, 1, 7, 11};
        int[] arr3 = new int[]{7, 1, 14, 11};
        int[] arr4 = new int[]{-2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(arr4));
    }
}
