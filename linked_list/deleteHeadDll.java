/* Delete Last Node of a Doubly Linked List
Problem Statement: Given a Doubly Linked List, delete the last node of the Doubly Linked List.
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
class deleteHeadDll{
       public Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public Node deleteFromEnd(Node head){
         // CASE 1 : empty list
    
        if(head == null){
            return null;
        }

        // CASE 2 : Only one node
        if(head.next == null){
            return null;
        }

        //traverse to last node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        // temp is last node
        Node secondLast = temp.prev;

        //Break links
        secondLast.next = null;
        temp.prev = null;   //optional cleanup

        return head;

    }
    // Print list
    public void printList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    // Main Function
    public static void main(String[]args){
        deleteHeadDll dll = new deleteHeadDll();
        Node head = null;

        // Create DLL: 1 <-> 3 <-> 4 <-> 1
        head = dll.insertAtEnd(head,1);
        head = dll.insertAtEnd(head,3);
        head = dll.insertAtEnd(head,4);
        head = dll.insertAtEnd(head,1);

        System.out.print("Before deletion: ");
        dll.printList(head);

        //delete last node

        head = dll.deleteFromEnd(head);

        System.out.print("After deletion: ");
        dll.printList(head);
    }
}