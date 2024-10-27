package org.hellointerview;

public class TwoPointerTechnique {

    //with two nested for
    public boolean twoSum(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            int firstNum = num[i];
            for (int j = i + 1; j < num.length; j++) {
                if (firstNum + num[j] == target)
                    return true;
            }
        }
        return false;
    }

    public boolean twoSumWithoutNestedLoop(int[] num, int target) {
        int leftPointer = 0, rightPointer = num.length - 1;
        while (leftPointer < rightPointer) {
            int left = num[leftPointer];
            int right = num[rightPointer];
            int sum = left + right;
            if (sum == target) {
                return true;
            } else if (sum < target) {
                leftPointer++;
            } else
                rightPointer--;
        }
        return false;
    }
}
