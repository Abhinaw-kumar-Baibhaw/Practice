
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data, Node next, Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class Reverse2LL {

    public static Node convertTo2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node res  = new Node(arr[i],null,prev);
            prev.next = res;
            prev = res;
        }
        return head;
    }

    public static Node reverse2LL(Node head){
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;   
            current.prev = current.next;  
            current.next = temp;   
            current = current.prev; 
        }
        return temp.prev;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       Node head = convertTo2LL(arr);
       head = reverse2LL(head);
       while(head!=null){
        System.out.print(head.data+" ");
        head = head.next;
       }
    }
}