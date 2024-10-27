package org.hellointerview;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoPointerTechniqueTest {
    TwoPointerTechnique twoPointer=new TwoPointerTechnique();
    int[] numbs= new int[]{1,3,4,6,8,10,13};
    @Test
    void testTwoSum(){
        int target = 13;
        assertTrue(twoPointer.twoSum(numbs, target));
        assertTrue(twoPointer.twoSumWithoutNestedLoop(numbs, target));

    }
    @Test
    void testTwoSum2(){
         int target = 6;
        assertFalse(twoPointer.twoSum(numbs, target));
        assertFalse(twoPointer.twoSumWithoutNestedLoop(numbs, target));
    }
}