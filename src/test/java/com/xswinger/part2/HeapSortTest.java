package com.xswinger.part2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HeapSortTest {

    private HeapSort sort = new HeapSort();

    @Test
    public void emptyArrSortTest() {
        int[] arr = new int[0];

        assertArrayEquals(sort.sort(arr), new int[0]);
    }

    @Test
    public void sortTest() {
        int[] arr = new int[] {965, 504, 95, 296, 75, 908, 682, 85, 654, 949, 596, 721, 461, 987, 532, 750, 213, 947, 200, 500, 251, 560, 983, 960, 682, 437, 169, 616, 363, 200, 330};
        
        assertArrayEquals(sort.sort(arr), new int[]{75, 85, 95, 169, 200, 200, 213, 251, 296, 330, 363, 437, 461, 500, 504, 532, 560, 596, 616, 654, 682, 682, 721, 750, 908, 947, 949, 960, 965, 983, 987});
    }

    @Test
    public void emptyArrBuildHeapTest() {
        int[] arr = new int[0];

        assertArrayEquals(sort.buildHeap(arr, 0, 0), new int[0]);        
    }

    @Test
    public void buildHeapTest() {
        int[] arr = new int[] {9, 10, 7, 8, 5, 6, 3, 4, 1, 2};

        assertArrayEquals(sort.buildHeap(arr, 10, 0), new int[] {10, 9, 7, 8, 5, 6, 3, 4, 1, 2});
    }
}
