/* Reverse a Linked List:
Problem Statement: Given the head of a singly linked list, write a program to reverse the linked list, and return the head pointer to the reversed list */

class Node {
    int val;
    Node next;

    // Constructor
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Reverse {
    public Node reverseList(Node head) {
        
        // Step 1: Initialize pointers
        Node prev = null;      // Will become new head
        Node curr = head;      // Start from head
        
        // Step 2: Traverse the list
        while (curr != null) {
            
            // Step 3: Store next node
            Node next = curr.next;  
            
            // Step 4: Reverse the link
            curr.next = prev;
            
            // Step 5: Move prev forward
            prev = curr;
            
            // Step 6: Move curr forward
            curr = next;
        }
        
        // Step 7: Return new head
        return prev;
    }
}
public class reverseLL{
    // utility function to print list
    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        // Create linked list: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

      System.out.print("Original List: ");
        printList(head);
        
        // Reverse list
        Reverse obj = new Reverse();
        head = obj.reverseList(head);

        System.out.println("Reversed List: ");
        printList(head);
    }
}