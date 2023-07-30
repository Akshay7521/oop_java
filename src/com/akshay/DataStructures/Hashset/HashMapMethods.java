package com.akshay.DataStructures.Hashset;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMapMethods {

    static class MyHashMap<K,V> {
        public static final int  DEFAULT_CAPACITY =4;
        public static final float  LOAD_FACTOR =0.75f;

        private class Node{
            K key;
            V value;
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private LinkedList<Node>[] buckets;
        private int n; // the number of entries in map
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        private  int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll,K key){
            // traverses the linkedlist and looks for a node with key , if found it returns its index otherwise it returns null
            for (int i =0; i< ll.size(); i++){
                if (ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        private void initBuckets(int N){
            // N- capacity/size of buckets array
            buckets = new LinkedList[N];
            for (int i=0; i<buckets.length; i++){
                buckets[i]= new LinkedList<>();
            }
        }

        public int size(){
            return n;
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets= buckets;
            initBuckets(oldBuckets.length * 2);
            n=0;
            for(var bucket : oldBuckets){
                for(var node:bucket){
                    put(node.key,node.value);
                }
            }
        }
        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n*1.0f)/buckets.length;
        }
        public  void put(K key, V value){
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket =buckets[bi];
            int ei = searchInBucket(currentBucket,key);
            if (ei == -1){
                // key doesn't exist , we have to insert a new node
                Node node = new Node(key, value);
                currentBucket.add(node);
                n++;
            } else {
                // update case
                Node currNode = currentBucket.get(ei);
                currNode.value = value;
            }
            if (n >= buckets.length * LOAD_FACTOR){

            }
        }

        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1){
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            // key doesn't exist
            return null;

        }

        public  V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket =buckets[bi];
            int ei = searchInBucket(currentBucket,key);
            if (ei != -1){
                // key exist
                Node currNode = currentBucket.get(ei);
                V val = currNode.value;
                currentBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }
    }

}
