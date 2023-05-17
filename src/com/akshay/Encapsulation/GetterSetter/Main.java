package com.akshay.Encapsulation.GetterSetter;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("John");
        person.setAge(25);

        System.out.println("Name: " + person.getName());  // Output: "Name: John"
        System.out.println("Age: " + person.getAge());    // Output: "Age: 25"
    }
}

