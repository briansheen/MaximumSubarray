package com.example;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums){
        int maxSoFar = 0;
        int maxEndingHere = 0;
        if(!(nums.length>0)){
            return 0;
        }
        maxEndingHere = nums[0];
        maxSoFar = nums[0];
        for(int i = 1; i < nums.length; ++i){
            maxEndingHere = Math.max((maxEndingHere+nums[i]),nums[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }
}
