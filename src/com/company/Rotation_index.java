package com.company;

public class Rotation_index {
   static int findKRotation(int arr[], int n) {
       int min = Integer.MAX_VALUE;
       int k =0;
       for (int i = 0; i <n ; i++) {
           if(arr[i]<min)
           {
               min = arr[i];
               k =i;
           }
       }
       return k;
    }
    public static void main(String[] args) {
        int [] s ={1, 2, 3, 4, 5};
        int asn = findKRotation(s,5);
        System.out.println(asn);

    }
}
