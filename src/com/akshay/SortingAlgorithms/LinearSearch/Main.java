package com.akshay.LinearSearch;

import jdk.dynalink.beans.StaticClass;

public class Main {
    public static void main(String[] args) {
        int[] arr={18,3,12,-7,14,28,46};
        int target = 28;
        System.out.println(LinearSearch(arr, target,1,5));
    }
    static int LinearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index = start; index < end; index++) {
            // check for element at every index if it is equals to target
            int element = arr[index];
            if (element == target){
                return index;
            }

        }
        return -1;
    }
}
