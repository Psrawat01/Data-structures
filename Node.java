package com.dsa.Linked_List;

public class Node {
    int value;
    Node next;
        Node(int value){ // parametrized constructor
            this.value = value;
        }
        Node(int value, Node next){
            this.value = value;
            this.next=next;
        }

}

