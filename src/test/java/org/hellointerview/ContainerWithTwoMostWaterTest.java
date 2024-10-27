package org.hellointerview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithTwoMostWaterTest {
    ContainerWithTwoMostWater container = new ContainerWithTwoMostWater();


    @Test
    public void maxAreaTest2() {
        int[] areas = new int[]{1,2,1};
        int expected = 2;
        assertEquals(expected, container.maxArea(areas));
    }
    @Test
    public void maxAreaTest3() {
        int[] areas = new int[]{1,1};
        int expected = 1;
        assertEquals(expected, container.maxArea(areas));
    }
    @Test
    public void maxAreaTest() {
        int[] areas = new int[]{3, 4, 1, 2, 2, 4, 1, 3, 2};
        int expected = 21;
        assertEquals(expected, container.maxArea(areas));
    }
    @Test
    public void maxAreaTest4() {
        int[] areas = new int[]{1,8,6,2,5,4,8,3,7};
        int expected = 49;
        assertEquals(expected, container.maxArea(areas));
    }

}