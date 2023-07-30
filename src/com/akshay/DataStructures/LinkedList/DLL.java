package com.akshay.DataStructures.LinkedList;

public class DLL {
   private Node head;
   public void insertFirst(int val){
      Node node = new Node(val);
      node.next = head;
      node.prev = null;
      if (head!=null) {
         head.prev = node;
      }
      head = node;
   }
   public int getSize() {
      int count = 0;
      Node current = head;

      while (current != null) {
         count++;
         current = current.next;
      }
      return count;
   }

   public void deleteLast() {
      if (head == null) {
         return;
      }
      if (head.next == null) {
         head = null;
         return;
      }
      Node secondLast = head;
      while (secondLast.next.next != null) {
         secondLast = secondLast.next;
      }
      secondLast.next = null;
   }

   public void insertLast (int val){
      Node node = new Node(val);
      Node last = head;
      node.next = null;
      if (head == null) {
         node.prev = null;
         head = node;
         return;
      }
      while (last.next != null){
         last = last.next;
      }
      last.next = node;
      node.prev = last;
   }
   public Node find(int value){
      Node node = head.next;
      long i =0;

      while (node != null){
         System.out.println("inside loop : " + (i++));

         if (node.val == value) {
            /*System.out.println(node);*/
            return node;
         }
         node = node.next;
         if (node == null){
            break;
         }
      }
      return null;
   }

   public void insert(int after, int val){
      Node p = find(after);
      if (p == null) {
         System.out.println("Does not exist");
         return;
      }
      Node node = new Node(val);
      node.next = p.next;
      p.next = node;
      node.prev = p;
      if (node.next.prev != null){
         node.next.prev = node;
      }
   }

   public void display(){
      Node node = head;
      Node last = null;
      while (node != null){
         System.out.print(node.val + " -> ");
         last = node;
         node = node.next;

      }
      System.out.println("END");

   }
   public  void displayReverse () {
      Node node = head;
      Node last = null;
      while (node != null){
         last = node;
         node = node.next;
      }
      System.out.println("Print in Reverse");
      while (last != null) {
         System.out.print(last.val + " -> ");
         last = last.prev;
      }
      System.out.println("START");
   }
   private class Node {
      int val;
      Node next;
      Node prev;

      public  Node(int val){
         this.val = val;
      }

      public Node(int val, Node next, Node prev) {
         this.val = val;
         this.next = next;
         this.prev = prev;
      }
   }
}
