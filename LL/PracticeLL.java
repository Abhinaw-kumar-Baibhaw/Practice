class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next= null;
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
public class PracticeLL {

    public static Node convertToLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node send = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            head.next=temp;
            head=temp;
        }
        return send;
    }

    public static void main(String args[]){
        int[] arr = {2,3,1,7,9};
        Node send = convertToLinkedList(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(send.data + " ");
            send = send.next;
        }
    }
}