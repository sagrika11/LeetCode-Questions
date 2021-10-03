package com.company;

public class Array_leftRotation {
 static void ArrayLeft_Rotation(int [] array , int k){
        int mod = k% array.length;
     for (int i = 0; i <array.length; i++) {
         System.out.println(array[(i+mod)%array.length]);
     }
    }
    public static void main(String[] args) {
        int [] array = { 1,6,8,34,90,56,123};
        ArrayLeft_Rotation(array,4);
    }
}
