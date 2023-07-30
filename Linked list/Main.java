package com.dsa.Linked_List;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.InsertFirst(23);
        ll.InsertFirst(34);
        ll.InsertFirst(37);
        ll.InsertAtLast(78);
        ll.InsertAtIndex(45,3);
        ll.InsertAtLast2(100);
        ll.Display();
       // ll.DeleteLast();
        ll.DeleteAtIndex(3);
        ll.Display();
        System.out.println(ll.Find(37));
       // System.out.println(ll.size);
    }
}
