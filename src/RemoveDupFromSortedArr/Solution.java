package RemoveDupFromSortedArr;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int nextUpdatingIndex = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[nextUpdatingIndex] = nums[i];
                nextUpdatingIndex++;
            }
        }

        return nextUpdatingIndex;
    }
}
