import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class head_of_ll
{
    public static Node detectCycle(Node head){
        // store visited nodes
        HashSet<Node> visited = new HashSet<>();
        // temporary pointer
        Node temp = head;
        // Traverse the linked list
        while(temp != null){

            // if node already exists,
            // then this is the start of cycle
            if(visited.contains(temp)){
                return temp;
            }
            // otherwise remember this node
            visited.add(temp);

            //move forward
            temp = temp.next;
        }
        //no cycle found
        return null;
        
    }
    public static void main(String[] args){
        // Create a linked list with cycle
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Cycle created

        Node cycleNode = detectCycle(head);

        if(cycleNode != null){
            System.out.println("Cycle starts at node with value:"+ cycleNode.data);
        }
        else{
            System.out.println("No cycle detected");
        }
    }
}