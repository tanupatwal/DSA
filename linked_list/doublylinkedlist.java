/* A node stores:
data (the value)
next reference (pointer) to the next node
prev reference (pointer) to the previous node

The list maintains:
head (first node) and tail (last node)
size (number of nodes)

Invariants:
head.prev == null
tail.next == null

For every node n, if n.next != null then n.next.prev == n; if n.prev != null then n.prev.next == n.
Memory: each node stores one extra reference compared to a singly-linked list (prev), so higher memory cost but more flexible traversal.

EXAMPLE:
null <- [10] <-> [20] <-> [30] -> null
        ↑        ↑        ↑
       prev     prev     prev
       next     next     next
 */

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class doublylinkedlist{

    Node head = null;
    
    public void insert(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
            temp.next = newNode;
            newNode.prev = temp;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[]args){
        doublylinkedlist list = new doublylinkedlist();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.print();
    }
}