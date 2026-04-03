/* Problem Statement: Given the head of a linked list of integers, determine the middle node of the linked list. However, if the linked list has an even number of nodes, return the second middle node.

Example 1:
Input: LL: 1  2  3  4  5 

Output:3
                
Explanation: 
Node with value 3 is the middle node of this linked list. 

Example 2:
Input: LL: 1  2  3  4  5  6
                          
Output: 4
                
Explanation: 
In this example, the linked list has an even number of nodes hence we return the second middle node which is 4.

Step 1: Count total nodes
Step 2: Go to middle position → n / 2
*/
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class TortoiseHareMethod{
public static Node findMiddle(Node head){

// step 1: count total nodes
int count = 0;
Node temp = head;

while(temp != null){
    count++;             //increase count
    temp = temp.next;    //move forward
}

// step 2: find middle index
int mid = count / 2;

// step 3: traverse again to middle 
temp = head;
for(int i = 0; i < mid; i++){
    temp = temp.next;
}
// step 4 : return middle node
return temp;
}

public static void main(String[]args){

  // creating liked list : 1 -> 2 -> 3 -> 4 -> 5 -> 6
  Node head = new Node(1);
  head.next = new Node(2);
  head.next.next = new Node(3);
  head.next.next.next = new Node(4);
  head.next.next.next.next = new Node(5);
  //head.next.next.next.next.next = new Node(6);

  Node middle = findMiddle(head);

  System.out.println("Middle element : " + middle.data);
}
}