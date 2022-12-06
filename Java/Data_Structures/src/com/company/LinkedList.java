package com.company;


//Linked List
public class LinkedList {
    Node head;
    Node tail;

    public void add(int data){
   // LL is emtpy
        if (this.head == null) {
            Node newNode = new Node(data);
            this.head =  newNode;
            this.tail = newNode;
        }
    //LL not emtpy
        else {
            Node newNode = new Node(data);
            newNode.previous = this.tail;
            this.tail = newNode;
            this.tail = newNode;
        }
    }

    public void listTraverse(LinkedList list) {
        Node curNode = list.head;

        while (curNode != null){
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
    }

}

//Node
class Node {
    int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
    }
}
