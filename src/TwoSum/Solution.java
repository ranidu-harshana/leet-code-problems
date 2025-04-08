package TwoSum;

/**
 * Problem Link: https://leetcode.com/problems/two-sum
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if(diff == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{2, 2};
    }
}
