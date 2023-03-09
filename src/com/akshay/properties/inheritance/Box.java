package com.akshay.properties.inheritance;

public class Box{
    double l;
    double h;
    double w;
    double weight;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
//    cube
     Box (double side){
// every single class inherites the Object class
//        super();

         this.l=side;
         this.h=side;
         this.w=side;
     }

     Box(double l, double h, double w){
         this.l=l;
         this.h=h;
         this.w=w;
     }

     Box(Box old){
         this.l=old.l;
         this.h= old.h;
         this.w= old.w;
     }

     public void Information(){
         System.out.println("running the box");
     }
}