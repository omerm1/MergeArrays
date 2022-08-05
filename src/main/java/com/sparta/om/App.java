package com.sparta.om;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MergeArray merge = new MergeArray();
        int[] a = {1,3,5,9,11,55};
        int[] b = {4,6,8,74};
        System.out.println(Arrays.toString(merge.mergeArray(a, b)));
    }

}
