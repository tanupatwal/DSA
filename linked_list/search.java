class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class search{

    public static boolean search(Node head, int val){

        Node current = head;
        while(current != null){
            if(current.data == val){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main(String[]args){

        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        int val =2;

        if(search(head,val)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}