package com.company;

public class Binary_Search {
  static int binarySearch(int [] arr, int key, int left, int right){

      while(left<=right){
          int mid = left + (right-left)/2;
          if(arr[mid]==key)
              return mid;
          if (arr[mid]>key)
              return binarySearch(arr, key, left, mid-1);
          else return binarySearch(arr,key, mid+1,right);
      }
      return -1;

    }// Recursive way for binary Search
    public static void main(String[] args) {
        int [] array = {56,78,90,95,100,134,190 };
        int key = 190;
        int left =0, right = array.length-1;
        int ans = binarySearch(array,key,left,right);
        System.out.println(ans);
    }
}
