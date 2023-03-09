package com.akshay.abstractExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("a red sweet fruit");
                break;
            case "orange":
                System.out.println("round fruit");
                break;
            case "grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("please enter valid fruit");

        }
    }
    
}