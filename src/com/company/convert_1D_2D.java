package com.company;

import java.util.Arrays;

public class convert_1D_2D {
    static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[n * i + j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int[][] ans = construct2DArray(arr,2,2);
        System.out.println(Arrays.toString(ans));
        } }


