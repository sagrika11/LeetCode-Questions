package com.company;

public class Array_RR {
    static  void Right_Rotation(int arr[], int k){
        int mod = k%arr.length;
        for (int i = 0; i <arr.length ; i++) {
            if(i<mod){
                System.out.println(arr[arr.length +(i-mod)]);
            }
            else System.out.println(arr[i-mod]);
        }
    }
    public static void main(String[] args) {
        int [] array = { 1,6,8,34,90,56,123};
        Right_Rotation(array,4);
    }
}
