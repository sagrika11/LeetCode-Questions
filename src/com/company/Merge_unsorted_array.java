package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Merge_unsorted_array {


    public static void main(String[] args) {
        int [] arr = {2,5,3};
        int[] arr2 = {67,89,90};
        int [] newA = new int[arr.length+arr2.length];
       System.arraycopy(arr,0,newA,0,arr.length);
       System.arraycopy(arr2,0,newA,arr.length,arr2.length);
        System.out.println(Arrays.toString(newA));
    }
}
