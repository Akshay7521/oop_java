package com.akshay.DataStructures.LinkedList;
//if there is any node available in 0
// size exceed 1. exception 2. increase size of list
// negative index 1. out of bound exception
// override or replace node
// if there are two ll 1. common element
// set operations on ll (set operation separate class 1. union AUB 2.intersection 3. A-b 4. b-a  etc. )
// handle all types of input value
// Arraylist implementation + algorithmic complexity 
public class Main {
    public static void main(String[] args) {

        // doubly linked list

        /* DLL list1 = new DLL();
        list1.insertFirst(3);
        list1.insertFirst(2);
        list1.insertFirst(8);
        list1.insertFirst(17);
        list1.insertFirst(12);
        list1.insertLast(99);
        list1.insert(8, 65);
        list1.display();*/
       // list1.displayReverse();

        // singly linked list

        LL list1 = new LL();
        list1.insertFirst(3);
        list1.insertFirst(2);
        list1.insertFirst(8);
        list1.insertFirst(17);
        list1.insertFirst(12);
        list1.insert(100,3);

        list1.display();
        LL list2 = new LL();
        list2.insert(12, 0);
        list2.insertFirst(2);
        list2.insertFirst(5);
        list2.insertFirst(8);
        list2.insertFirst(26);
        list2.insertFirst(25);
        list2.display();
        list1.printSetDifference(list2,list1);
       /* LL linkedList = new LL();

        linkedList.printUnion(list1,list2);
        linkedList.printIntersection(list1,list2);
        linkedList.printSetDifference(list2,list1);*/

        /*System.out.println(list1.deleteFirst());
        list1.display();
        System.out.println(list1.deleteLast());
        list1.display();

        System.out.println(list1.delete(4));
        list1.display();
        list1.find(12);*/

        /*Cll list1 = new Cll();
        list1.insert(23);
        list1.insert(3);
        list1.insert(19);
        list1.insert(75);
        list1.display();
*/
    }
}
