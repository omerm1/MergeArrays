package com.sparta.om;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeTester {
    @Test
    @DisplayName("Given two sorted arrays, return one combined sorted array")
    void givenTwoSortedArraysReturnOneCombinedSortedArray() {
        int[] a = {1,3,5,6,8,9,11,23,44};
        int[] b = {5,8,33,222};
        int[] expected = {1,3,5,5,6,8,8,9,11,23,33,44,222};
        MergeArray mergeCheck = new MergeArray();
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(mergeCheck.mergeArray(a, b)));
    }
}
