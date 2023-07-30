package com.dsa.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.InsertAtFirst(23);
        dl.InsertAtFirst(34);
        dl.InsertAtFirst(4);
        dl.InsertLast(100);
       // dl.displayreverse();
        dl.InsertIndex(56,2);
        dl.display();
        //dl.DeleteFirst();
        //dl.DeleteLast();
        dl.DeleteIndex(2);
        dl.display();
    }
}
