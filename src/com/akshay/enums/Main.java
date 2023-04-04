package com.akshay.enums;

public class Main {
    public static void main(String[] args) {
        Color c1 = Color.RED;

        System.out.println("RED Enum name: " + c1.name());
        System.out.println("RED Enum value: " + c1.getValue());

        for (Color color: Color.values()) {
            System.out.println("Enum value: " + color.getValue());
        }
    }
}