package ContainerWithMostWater;

/**
 * https://leetcode.com/problems/container-with-most-water
 */
public class Solution {
    public int maxArea(int[] height) {
        int startIndex = 0;
        int endIndex = height.length - 1;

        int maxArea = 0;

        while (endIndex > startIndex) {
            int newArea = (endIndex - startIndex) * min(height[startIndex], height[endIndex]);

            if(newArea > maxArea) {
                maxArea = newArea;
            }

            if (height[startIndex] > height[endIndex]) {
                endIndex--;
            } else {
                startIndex++;
            }
        }

        return maxArea;
    }

    int min(int num1, int num2) {
        return Math.min(num1, num2);
    }
}
