package com.akshay.LeetcodeProblems;
/* given an array of integers nums and an integer target, return indices of two numbers such that they add up to target
* you may assume that each input would have exactly one solution and you may not use the same element twice
* you can return the answer in any order
* input: nums=[2,7,11,15] target=9
* output =[0,1]
* https://www.youtube.com/watch?v=Yyyi12oaK94&list=PPSV */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // iterate over array and check for target
   /*public static int[] twoSum(int[] nums, int target){


       for (int i = 0; i < nums.length ; i++) {

           for (int j = i+1; j < nums.length ; j++) {
               if (nums[i]+nums[j]==target){
                   return new int[]{i,j};
               }
           }
       }
       return nums;
   }*/

    // using hashmap
    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> complements= new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null){
                return new int[]{i,complementIndex};
            }
            complements.put(target-nums[i],i);
        }
        return nums;
    }


    public static void main(String[] args) {
       int[] nums={5,2,4};
       int target=6;
       int[] answer=twoSum(nums, target);
        System.out.println(Arrays.toString(answer));
    }
}
