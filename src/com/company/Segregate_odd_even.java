package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Segregate_odd_even {
    static  void segregateEvenOdd(int arr[], int n) {

        int left = 0, right =n-1; int k=0;
        while (left<right){
            while (arr[left]%2==0 && left<right){
                left++;
            }

            while (arr[right]%2==1 &&left<right){
                right--;
                k++;
            }
            if(left<right){
                int temp = arr[left];

                arr[left]=arr[right];
                arr[right]=temp;


                left++;
                right--;
            }
        }
       // Arrays.sort(arr,k, n);
    }
    public static void main(String[] args) {
        int [] arr = {12, 34, 45, 9, 8, 90, 3};
        segregateEvenOdd(arr,7);
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
