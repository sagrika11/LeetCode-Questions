package com.company;

public class convert_1D_2D {
    static int[][] convert(int[]arr, int m, int n){
        int two[][] = new int[m][n];
        if(arr.length<=2){
            return new int[0][0];
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                two[i][j]=arr[n*i+j];
            }

        }
        return new int[0][0];
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int[][] ans = convert(arr,2,2);
        System.out.println(ans);
    }
}
