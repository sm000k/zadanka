package pl.zimi.zadanka;

public class Zad6 {
    public int removeDuplicates(int[] nums) {
        int Len = 0;
        int numsLen = nums.length - 1;
        int numsMin = nums[0];
        int numsMax = nums[numsLen];
        int arrayRank = numsMax - numsMin + 1;
//        System.out.println("arrayRank = " + arrayRank);


        int i = 0;
        while (nums[arrayRank - 1] != numsMax) {
            if (i + 1 == nums.length) i = 0;
            if (nums[i] - nums[i + 1] == 0) {
//                System.out.println("przerzut =" + "i[" + i + "] " + nums[i]);
                for (int j = i + 1; j < numsLen; j++) {
                    nums[j] = nums[j + 1];
                }
            }
            i++;
        }
        for (int number : nums) {
            System.out.println(number);
        }


        return arrayRank;
    }
}
