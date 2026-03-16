/* Given the head of a linked list, print the length of the linked list. 
Examples: 
Input: 0->1->2 
Output: 3
Explanation: The list has a total of 3 nodes, thus the length of the list is 3
*/
import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class length{
    Node head;    // starting node of list

    //insert at beginning
    public void insert(int value){
        Node newNode = new Node(value);  // create node
        newNode.next = head;              // point new node to old node
        head = newNode;                   // update the start of the linked list

    }
    // print list 
    public void printList(){
       
        Node temp = head;    // create a temporary pointer

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;   // move to the next node
    }
    System.out.println("null");
}
    // find length()
    public void findLength(){
        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println("Length of Linked List: " + count);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        length list = new length();

        System.out.print("Enter number of nodes:");
        int n = sc.nextInt();

        for(int i = 0; i< n; i++){
            System.out.print("Enter Value: ");
            int value = sc.nextInt();
            list.insert(value);
        }
        System.out.println("Linked List: ");
        list.printList();

        list.findLength();
    }
      }

