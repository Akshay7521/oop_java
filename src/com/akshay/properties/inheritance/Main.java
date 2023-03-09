package com.akshay.properties.inheritance;

public class Main{
    public static void main(String[] args) {
//        Box box = new Box(4.6, 7.9 , 1.5);
//        Box box2=new Box(box);
//        System.out.println(box.l + " " + box.h+" " + box.w);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(1,2,3,4);
//        System.out.println(box3.h+" "+ box3.weight);

//all the members of 'Box' class can be accessed by the 'box5'
//the type of reference variable determines the what members can be accessed
//when reference to a subclass object is assigned to super class you will have only access to that are defined in super class

        Box box5 = new BoxWeight(2,3,4,5);
        System.out.println(box5.w);

// there are many variable in parent and child classes
// you are given access to variables that are in reference types i.e. BoxWeight
// hence, you should have access to weight variable
// this also means that the ones you are trying access should be initialized
// but here, when the obj itself is a of type parent class, how will you call the child class
// this is why error
//        BoxWeight box6 = new Box(2,3,4,5);
//        System.out.println(box6);

    }
}
