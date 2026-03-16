import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class deletion{

    Node head;   // starting node of list

    // insert at beginning
    public void insert(int value){
        Node newNode = new Node(value);    // create node
        newNode.next = head;              // point new node to old node
        head = newNode;                   //update the start of the linked list
    }
    // delete head
    public void deleteHead(){
        if(head == null){
            System.out.print("Empty list");
            return;
        }
        head = head.next;
    }
    // print the list
    public void printList(){
        Node temp = head;  // create a temporary pointer
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;    // move to the next node
        }
        System.out.println("null");
    }
    public static void main(String[]args){
        deletion list = new deletion();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.printList();

        list.deleteHead();
        list.printList();
    }
}