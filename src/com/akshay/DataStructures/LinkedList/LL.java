package com.akshay.DataStructures.LinkedList;
/*1:17:11 / 1:55:56*/
public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // union of two singly linked lists
    public void printUnion(LL list1, LL list2) {
        LL unionList = new LL();

        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null) {
            unionList.insertLast(current1.value);
            current1 = current1.next;
        }

        while (current2 != null) {
            if (unionList.find(current2.value) == null) {
                unionList.insertLast(current2.value);
            }
            current2 = current2.next;
        }

        System.out.print("union : ");
        unionList.display();
    }

    // intersection of two lists
    public void printIntersection(LL list1, LL list2) {
        LL intersectionList = new LL();

        Node current1 = list1.head;

        while (current1 != null) {
            if (list2.find(current1.value) != null) {
                intersectionList.insertLast(current1.value);
            }
            current1 = current1.next;
        }

        System.out.print("intersection : ");
        intersectionList.display();
    }
    // diff. between two lists
    public void printSetDifference(LL list1, LL list2) {
        LL differenceList = new LL();

        Node current1 = list1.head;


        while (current1 != null) {
            if (list2.find(current1.value) == null) {
                differenceList.insertLast(current1.value);
            }
            current1 = current1.next;
        }

        System.out.print("differenceList: ");
        differenceList.display();
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head=node;
        if (tail == null){
            tail= head;
        }
        size +=1;
    }
    public void insertLast(int val){
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index ==  size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    public int delete(int index) {
        if (index==0) {
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node prev = get(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;

    }
    public  int deleteLast() {
        if (size <+ 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return  val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public  Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value + " -> ");
            temp= temp.next;
        }
        System.out.println("END");
    }
    private class Node{
       private int value;
       private Node next;

       public Node(int value) {
           this.value = value;
       }

       public Node(int value, Node next) {
           this.value = value;
           this.next = next;
       }
   }
}
