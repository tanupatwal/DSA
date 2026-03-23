/*
Insert at end of Doubly Linked List
Problem Statement: Given a doubly linked list, and a value ‘k’, insert a node having value ‘k’ at the end of the doubly linked list
*/
class Node{
    int data;
    Node next;
    Node prev;
    //constructor to create a new node
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class insertdll{
    public Node insertAtEnd(Node head, int k){
        //create new node
        Node newNode = new Node(k);

        //if list is empty
        if(head == null){
            return newNode;
        }

        // traverse to last node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        //insert at end
        temp.next = newNode;  // forward link
        newNode.prev = temp;  // backward link

        // return head
        return head;

    }

//function to print list
public void printList(Node head){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data +" <-> ");
        temp = temp.next;
    }
    System.out.println("NULL");
}

public static void main(String[]args){
    insertdll dll = new insertdll();

    Node head = null;
    head = dll.insertAtEnd(head, 10);
    head = dll.insertAtEnd(head, 20);
    head = dll.insertAtEnd(head, 30);
    
    System.out.println("Before inserting 40:");
    dll.printList(head);

    head = dll.insertAtEnd(head,40);
    System.out.println("After inserting 40:");
    dll.printList(head);
}
}