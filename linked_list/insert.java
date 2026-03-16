/* Problem Statement: Given a linked list and an integer value val, insert a new node with that value at the beginning (before the head) of the list and return the updated linked list. */
import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
// insert class
class insert{
    Node head;    // starting node pf list

//method to insert at the beginning
    Node insertAtHead(int val){
        Node newNode = new Node(val);  // create new node
        newNode.next =head;            //point new node to current head
        head = newNode;               //move head to new node
        return head;                 //return updated head
    }

    //insert at end
    void addAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //method to display linked list
    void display(){
    Node temp = head;
    while(temp != null){         //Keep running the loop until temp becomes null
        System.out.print(temp.data + " ->");               //temp.data → means "give me the value stored in current node"
        temp = temp.next;                                   //temp.next → address of next node
    } 
    System.out.println("null");
}
// main method
public static void main(String[]args){
    insert list = new insert();

    // creating initial list 10 -> 20 -> 30
    list.addAtEnd(10);
    list.addAtEnd(20);
    list.addAtEnd(30);

    System.out.println("Before insertion: ");
    list.display();

    // Insert new value at head
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value to insert at head: ");
    int value = sc.nextInt();

    list.insertAtHead(value);

    System.out.println("After insertion: ");
    list.display();
}
}