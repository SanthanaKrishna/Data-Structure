package org.DSA.TwoPointer;

public class ContainerWithMostWater {
    public static int maxWater(int[] heights) {
        int left = 0, right = heights.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int currentWater = width * Math.min(heights[left], heights[right]);
            maxWater = Math.max(maxWater, currentWater);
            if (heights[left] < heights[right]) { // Move the pointer corresponding to the smaller height
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] heights = {3, 7, 4, 5, 2};
        int result = maxWater(heights);
        System.out.println("Maximum water stored: " + result);
    }
}
