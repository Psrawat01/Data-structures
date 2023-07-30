package com.dsa.DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    //Node Last;
   // Node tail;
    int size;
    DoublyLinkedList(){
        this.size=0;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+"<->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    //Display in Reverse
    public void displayreverse(){
        Node temp = head;
        while (temp.next!=null){
            temp= temp.next;
        }
        while (temp!=null) {
            System.out.print(temp.value + "<->");
            temp = temp.prev;
        }
        System.out.println("END");
    }
    // INSERTION IN DOUBLY LINKED LIST
    //INSERT AT FIRST
    public void InsertAtFirst(int value){
        Node node = new Node(value);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head = node;
        size++;
    }
    // Insert at last
    public void InsertLast(int value){
        Node node = new Node(value);
        Node temp = head;
        if (head==null){
            node.prev=null;
            head=node;
            node.next=null;
        }
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next=node;
        node.next=null;
        node.prev=temp;
    }
 // INSERT AT GIVEN INDEX
    public void InsertIndex(int value, int index) {
        if (index == 0) {
            InsertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        node.prev = temp;
        temp.next = node;
    }
    // DELETION IN DOUBLY LINKED LIST
    public int DeleteFirst(){
        int value = head.value;
        head.next.prev=null;
        head=head.next;
        return value;
    }
    public int DeleteLast(){
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.prev.next=null;
        return temp.value;
    }
    public int DeleteIndex(int index){
        if (index==0){
            return DeleteFirst();
        }
        Node temp = head;
        for (int i = 1; i <=index ; i++) {
            temp  = temp.next;
        }
        int value = temp.value;
       temp.next.prev= temp.prev;
      temp.prev.next=temp.next;
        return value;
    }
}
