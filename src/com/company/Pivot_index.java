package com.company;

public class Pivot_index {
    public static int findEquilibrium(int arr[], int n)
    { int sum =0; int leftSum=0; int rightSum=0;
        for(int i =0; i<n;i++){
            sum+=arr[i];
        }
        for (int i = 0; i <n ; i++) {
            if(leftSum==sum-arr[i]-leftSum)
                return i;
            else leftSum+=arr[i];

        }
        return -1;

    }
    public static void main(String[] args) {
        int [] a ={2,3,5,-1,0,9};
        int ans = findEquilibrium(a,a.length);
        System.out.println(ans);
    }
}
