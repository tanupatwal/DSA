//Create a new custom type called Node

//Node class 
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
//LinkedList Class
class ll1{

    Node head;

//insert at beginning
void insertAtBeginning(int data){
    Node newNode = new Node(data);

    newNode.next = head;
    head = newNode;
}
// print function
void printList(){
    Node temp = head;

    while(temp != null){
        System.out.print(temp.data + " ->");
        temp = temp.next;
    }
    System.out.println("null");
}
//main method
public static void main(String[]args) {

    ll1 list = new ll1();

    list.insertAtBeginning(10);
    list.insertAtBeginning(20);
    list.insertAtBeginning(30);

    list.printList();
}
}