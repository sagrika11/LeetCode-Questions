package com.company;

public class Search_in_infiniteArray {
    static  int infiniteSort(int [] arr , int key){
        int left = 0, right = 1; int val = arr[0];
        while (val<key)
        {
            left = right;
            if(2*right < arr.length-1)
                right=2*right;
            else right = arr.length-1;
             val = arr[right];

        }
        return binary_Search(arr,left,right,key);
    }
    static  int binary_Search(int [] arr, int left, int right , int key){
        while (left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid]>key)
                return binary_Search(arr,left, mid-1,key);
            else return binary_Search(arr, mid+1,right, key);
        }
        return -1;

    }
    public static void main(String[] args) {
        int [] array = {1,3,7,8,12,58,72 };

        int ans = infiniteSort(array,72);
        System.out.println(ans);

    }
}
