package javaclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LRU {
    private class Node{
        Node next,prev;
        int key,value;
        Node(){}
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    private Node head,tail;
    private Map<Integer,Node>map;
    private int count,capacity;
    private void addNode(Node node){
        Node old=head.next;
        head.next=node;
        node.prev=head;
        node.next=old;
        old.prev=node;
    }
    private void removeNode(Node node){
        Node previous=node.prev;
        previous.next=node.next;
        node.next.prev=previous;
    }
    private void moveTohead(Node node){
        removeNode(node);
        addNode(node);
    }
    private Node popTail(){
        Node pre=tail.prev;
        removeNode(pre);
        return pre;
    }
    public LRU(int capacity){
        this.capacity=capacity;
        this.count=0;
        map=new HashMap<>();
        head=new Node();
        tail=new Node();
        head.next=tail;
        tail.prev=head;
    }
    public int get(int key){
        Node node=map.get(key);
        if (node==null)
            return -1;
        moveTohead(node);
        return node.value;
    }
    public void put(int key,int value){
        Node node=map.get(key);
        if (node==null){
            if (count==capacity){
                map.remove(popTail().key);
                --count;
            }
            Node fresh=new Node(key,value);
            map.put(key,fresh);
            addNode(fresh);
            count++;
        }else {
            node.value=value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int capacity=Integer.valueOf(scanner.nextLine().trim());
        LRU instance=new LRU(capacity);
        while (scanner.hasNextLine()){
            String command=scanner.nextLine().trim();
            if (capacity>0 && command.charAt(0)=='p'){
                int key=Integer.valueOf(command.substring(2,command.lastIndexOf(" ")));
                int value=Integer.valueOf(command.substring(command.lastIndexOf(" ")+1));
                instance.put(key,value);
            }else if (command.charAt(0)=='g'){
                if (capacity<=0){
                    System.out.println(-1);
                }else{
                    int key=Integer.valueOf(command.substring(2));
                    System.out.println(instance.get(key));
                }
            }
        }
    }
}
