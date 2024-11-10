package com.scaler.dsa.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Merge2SortedLL {

    // Implementing using custom Node class
    public static Node merge2sortedLL(Node ll1 , Node ll2){

        //Handle first element separately
        Node ans = null;
        if( ll1.getData() < ll2.getData()){
            ans = ll1;
            ll1 = ll1.getNext();
        } else{
            ans = ll2;
            ll2 = ll2.getNext();
        }

        Node temp = ans;

        while( ll1 != null && ll2 != null){

            if( ll1.getData() < ll2.getData()){
                temp.setNext(ll1);
                ll1 = ll1.getNext();
                temp = temp.getNext();
            } else {
                temp.setNext(ll2);
                ll2 = ll2.getNext();
                temp = temp.getNext();
            }
        }

        while( ll1 != null){
            temp.setNext(ll1);
            ll1 = ll1.getNext();
            temp = temp.getNext();
        }

        while( ll2 != null){
            temp.setNext(ll2);
            ll2 = ll2.getNext();
            temp = temp.getNext();
        }

        return ans;
    }
}

// Custom Node class for LinkedList object
class Node{
    private int data;
    private Node next;

    public Node( int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        Node node = this;
        StringBuilder strBldr = new StringBuilder();
        while(node != null){
            strBldr.append(node.getData())
                    .append(" ");
            node = node.getNext();
        }

        return strBldr.toString();
    }
}



class MainRunner{
    public static void main(String[] args) {

        Node node1 = MainRunner.getLinkedListHead();
        Node node2 = MainRunner.getLinkedListHead();

        System.out.println(node1.toString());
        System.out.println(node2.toString());

        Node finalNode = Merge2SortedLL.merge2sortedLL(node1, node2);
        System.out.println(finalNode);
        System.out.println("test change for git commit");

    }

    public static Node getLinkedListHead(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int listSize = scanner.nextInt();

        System.out.println("Enter elements : ");

        Node head = new Node(scanner.nextInt());
        Node temp = head;

        while(listSize > 1){
            int nodeData = scanner.nextInt();

            Node node = new Node(nodeData);
            temp.setNext(node);
            temp = node;
            listSize--;
        }

        return head;
    }
}
