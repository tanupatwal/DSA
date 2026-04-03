/* Problem Statement: Given a doubly linked list of size ‘N’ consisting of positive integers, your task is to reverse it and return the head of the modified doubly linked list.

Examples
Input : DLL - 1 <-> 2 <-> 3 <-> 4

Output: DLL - 4 <-> 3 <-> 2 <-> 1

Explanation : The doubly linked list is reversed and its last node is returned at the new head pointer.
*/
class Node{
    int data;
    Node prev, next;

    Node(int data){
        this.data= data;
        this.prev = null;
        this.next = null;
    }
}
public class reverseDll{
    public static Node ReverseDll(Node head){
        if(head == null)
        return null;

        Node curr = head;
        Node temp = null;

        while(curr != null){
            // swap prev and next
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            //move to next node (which is prev after swap)
            curr = curr.prev;
        }
        // update head
        if(temp != null){
            head = temp.prev;
        }
        return head;
    }
    // print list
    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " <-> ");
            curr = curr.next;

        }
        System.out.println("NULL");
    }
        public static void main(String[]args){
            //creating DLL : 1 <-> 2 <-> 3 <-> 4
            Node head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);

            head.next = second;
            second.prev = head;

            second.next = third;
            third.prev = second;


            third.next = fourth;
            fourth.prev = third;

            System.out.print("Original: ");
            printList(head);

            head = ReverseDll(head);

            System.out.println("Reversed : ");
            printList(head);
        }
}