package pl.zimi.zadanka;

/*
    Source:
    https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

public class Zad6 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int numsLen = nums.length - 1;
        int numsMax = nums[numsLen];
        int uniqueNumbersCounter = 0;
        int tempPreviousNumber = Integer.MIN_VALUE;
        int i = 0;

        for (int number : nums) {
            if (tempPreviousNumber != number) {
                tempPreviousNumber = number;
                uniqueNumbersCounter++;
            }
            if (number == numsMax) break;
        }
        while (nums[i + 1] != numsMax) {
            while (nums[i] == nums[i + 1]) {
                for (int j = i + 1; j < numsLen; j++) {
                    nums[j] = nums[j + 1];
                }
            }
            i++;
        }
        for (
                int number : nums) {
            System.out.println(number);
        }
        return uniqueNumbersCounter;
    }
}
