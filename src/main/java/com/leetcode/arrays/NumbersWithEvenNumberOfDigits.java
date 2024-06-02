package com.leetcode.arrays;
/**
 * метод данного класса должен вернуть количество чисел состоящих из честного количества цифр
 */

public class NumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int number;
        int numberOfDigits = 0;
        int evenNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            number = nums[i];
            while (number != 0) {
                number = number / 10;
                numberOfDigits++;
            }
            if (numberOfDigits % 2 == 0) {
                evenNumbers++;
            }
            numberOfDigits = 0;
        }
        return evenNumbers;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{555, 901, 482, 1771};
        int[] testnums = new int[]{345, 344, 224, 444, 224};
        int rsl = findNumbers(nums);
        System.out.println(rsl);
    }
}
