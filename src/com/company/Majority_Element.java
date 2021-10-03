package com.company;

import java.util.*;

public class Majority_Element {
    static int majorityElement(int a[], int size)
        {
            HashMap<Integer, Integer> hs =  new HashMap();
            for (int i = 0; i <size ; i++) {
                if(hs.containsKey(a[i])){
                    int count = hs.get(a[i])+1;
                    if(count>size/2){
                        return a[i];
                    }
                    else hs.put(a[i],count);

                }
                else hs.put(a[i],1);
            }
           /*int max =0, res =0;
            for (Map.Entry <Integer,Integer> e : hs.entrySet()){
                if(max<e.getValue())
                {
                    res = e.getKey();
                    max= e.getValue();

                }
                else return -1;
            }
            return res;*/
            return -1;

    }

    public static void main(String[] args) {
        int [] arry = { 1,15};
        int size = arry.length;
        int ans = majorityElement(arry,size);
        System.out.println(ans);
    }
}
