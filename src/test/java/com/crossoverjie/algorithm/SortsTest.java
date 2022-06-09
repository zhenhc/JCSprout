package com.crossoverjie.algorithm;

import junit.framework.TestCase;

import java.util.Arrays;

public class SortsTest extends TestCase {

    //三向切分快速排序
    public void testQuickSort3(){
        int[] arr = {2, 1, 5, 6, 8, 4, 12, 11, 13, 15, 7, 9, 0, -1};
        Sorts.quickSort3(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
