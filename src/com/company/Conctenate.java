package com.company;

public class Conctenate {
    static int numOfPairs(String[] nums, String target) {

        int count =0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j <nums.length ; j++) {
                if((nums[i] + nums[j]).equals(target) && (nums[j] + nums[i]).equals(target))
                  count= count+2;
              else if((nums[i] + nums[j]).equals(target) && !(nums[j] + nums[i]).equals(target))
                {
                    count++;
                }
              else if(!(nums[i] + nums[j]).equals(target) && (nums[j] + nums[i]).equals(target)){
                  count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s[] = {"74","1","67","1","74"};
        String t = "174";
        int ans = numOfPairs(s,t);
        System.out.println(ans);
    }
}
