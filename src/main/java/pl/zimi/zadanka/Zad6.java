package pl.zimi.zadanka;

public class Zad6 {
    public int removeDuplicates(int[] nums) {
        int Len = 0;
        int numsLen = nums.length - 1;
        int arrayRank = nums[numsLen];


        int i = 0;
        while (nums[arrayRank - 1] != arrayRank) {
            if (i + 1 == nums.length) i = 0;
            if (nums[i] - nums[i + 1] == 0) {
                System.out.println("przerzut =" + "i[" + i + "] " + nums[i]);
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
