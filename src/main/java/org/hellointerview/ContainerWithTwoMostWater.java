package org.hellointerview;

public class ContainerWithTwoMostWater {

    public int maxArea(int[] areas) {
        int leftPointer = 0;
        int rightPointer = areas.length - 1;
        int maxValue = 0;
        while (leftPointer < rightPointer) {
            int left = areas[leftPointer];
            int right = areas[rightPointer];
            int width = rightPointer - leftPointer;
            int height = Math.min(left, right);
            int currentArea = width * height;
            maxValue = Math.max(currentArea, maxValue);
            if (left < right) {
                leftPointer++;
            } else
                rightPointer--;
        }
        return maxValue;
    }

}
