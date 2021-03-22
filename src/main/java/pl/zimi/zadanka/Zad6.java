package pl.zimi.zadanka;

public class Zad6 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int numsLen = nums.length - 1;
        int numsMin = nums[0];
        int numsMax = nums[numsLen];
        int uniqueNumbersCounter = 0;
        int tempPreviousNumber = 1000000;
        int i = 0;
        for (int number : nums) {
            if (tempPreviousNumber != number) {
                tempPreviousNumber = number;
                uniqueNumbersCounter++;
            }
        }

        i = 0;
        while (nums[i + 1] != numsMax) {

            while (nums[i] == nums[i + 1]) {
                for (int j = i + 1; j < numsLen; j++) {
                    nums[j] = nums[j + 1];
                }
                System.out.print("przerzut =" + "i[" + i + "] " + nums[i] + " ");
                for (int number : nums) {
                    System.out.print(number);
                }
                System.out.println("");
            }
            i++;
        }

        for (int number : nums) {
            System.out.println(number);
        }
        return uniqueNumbersCounter;
    }
}
