package com.akshay.abstractExample;

public class son extends parent {
    @Override
    void career(String name){
        System.out.println("i am going to be doctor");
    }

    @Override
    void partner (String name, int age){
        System.out.println("I love" + name+"she is "+age);

    }
}
