package com.akshay.properties.inheritance;

public class BoxWeight extends Box {
    double weight;
    public  BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {

// used to initialize the values present in parent class
// calls the parent class constructor
// whenever a subclass like the BoxWeight need to refer to the
// super class from which is derived
// for that you can use Super()
        super(l, h, w);
        this.weight = weight;

// when you want to access the method or element from parent class
// then you can use super()
// example
//        System.out.println(super.weight);

    }
}
