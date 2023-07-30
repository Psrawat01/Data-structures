package com.dsa.Linked_List;

public class LinkedList {
    Node head;
   Node tail;
   int size;
   LinkedList(){        // just for convenience to measure size
       this.size=0;
    }
    public void Display(){
       Node temp = head;
       while (temp!=null){
           System.out.print(temp.value+" ->");
           temp =  temp.next;
       }
        System.out.println("END");

    }
    // Insertions
    // 1. Insertion at first;
    public void InsertFirst(int value){
       Node node = new Node(value);
       node.next=head;
       head=node;
        if (tail == null){
            tail=head;
        }
       size++;
    }
    //Insertion at Index using tail
    public void InsertAtLast(int value){
       Node node= new Node(value);
       if (tail==null){
           InsertFirst(value);
           return;
       }
       tail.next=node;
       node=tail;
       size++;
    }
    // INSERT AT LAST WITHOUT using TAIL
    public void InsertAtLast2(int value){
       Node node= new Node(value);
       Node temp = head;
       while(temp.next!=null){
           temp = temp.next;
       }
       temp.next=node;
       node.next=null;
       size++;
    }
    // INSERT AT A GIVEN INDEX
    public void InsertAtIndex(int value,int index){
       if (index==0){
           InsertFirst(value);
           return;
       }
       if (index== size){
           InsertAtLast(value);
           return;
       }
       Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    // Deletion in linked List
    // deleting the first element
    public int DeleteFirst(){
       int value= head.value;
       head = head.next;
       if (head==null){
           tail=null;
       }
       size--;
       return value;
    }

    // deleting the Last Element
    public int DeleteLast(){
       if (size<=1){
           return DeleteFirst();
       }
       Node temp = head;
       while (temp.next.next!=null){
           temp = temp.next;
       }
       int value = temp.next.value;
       temp.next=null;
       size--;
       return value;
    }
    // DELETING AT THE SPECIFIC INDEX
    public int DeleteAtIndex(int index){
       if (index==0){
           return DeleteFirst();
       }
       if (index== size){
           return DeleteLast();
       }
       Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp= temp.next;
        }
        int value = temp.next.value;
        temp.next= temp.next.next;
        return value;
    }


    // Find NOde with value OR Search in Linked list
   public Node Find(int value){
       Node temp = head;
       while(temp!=null){
           if (temp.value==value){
               return temp;
           }
           temp= temp.next;
       }
       return null;
   }
}
