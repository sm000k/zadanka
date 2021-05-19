package pl.zimi.zadanka;
/*
source:
https://leetcode.com/problems/single-number/
 */

import java.util.LinkedList;
import java.util.List;

public class Zad12 {

    public int singleNumber(int[] nums) {

        List<Integer> occurrenceList = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!occurrenceList.contains((Integer) nums[i])) {
                occurrenceList.add(nums[i]);
            } else {
                occurrenceList.remove((Integer)nums[i]);
            }
        }
        return occurrenceList.get(0);
    }
}
