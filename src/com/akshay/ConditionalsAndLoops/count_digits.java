package com.akshay.ConditionalsAndLoops;

import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int digit_to_count= in.nextInt();
        int count=0;
        while (num>0){
            int rem=num%10;
            if (rem == digit_to_count){
                count++;

            }
            num = num/10;

        }
        System.out.println(count);
    }
}
