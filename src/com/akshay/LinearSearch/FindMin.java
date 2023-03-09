package com.akshay.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr ={18,3,12,7,14,28,46,13};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans =arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
