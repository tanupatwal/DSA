/* Detect a loop in a linked list 
using hashing 
While traversing linked list, store visited nodes.
If some node appears again → loop exists.
*/
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class detect{
    public static boolean hasLoop(Node head){
        HashSet<Node> visited = new HashSet<>();
        Node current = head;
        while(current != null){
            if(visited.contains(current)){
                return true;
            }
            visited.add(current);
            current = current.next;
        }
        return false;
    }
    public static void main(String[]args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next =b;
        b.next = c;
        c.next = d;
        d.next = b ; // creating loop

        System.out.println(hasLoop(a));
    }
}