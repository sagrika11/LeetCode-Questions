package com.company;

public class Alternate_evenOdd {
    void leftRotate(long arr[], int k,int n)
    {

        long mod = k%n;
        for(int i =0; i<n;i++){
            System.out.println(arr[(int) ((i+mod)%n)]);
        }
    }
    public static void main(String[] args) {
      Alternate_evenOdd k = new Alternate_evenOdd();
      long[] a = {1, 2, 3, 4, 5, 6, 7};
      k.leftRotate(a,2,7);
    }
}
