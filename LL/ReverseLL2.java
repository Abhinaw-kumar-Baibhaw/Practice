package LL;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}
public class ReverseLL2 {
    public static Node convertToLL(int[] arr){
        Node res = new Node(arr[0]);
        Node head = res;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            res.next=temp;
            res=temp;
        }
        return head;
    }
    public static Node reverseLL2(Node head){
        Node prev = null;
        Node temp = head;
        while(temp!=null){
           Node front = temp.next;
           temp.next=prev;
           prev=temp;
           temp=front;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       Node head = convertToLL(arr);
      head = reverseLL2(head);
       while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
       }
    }
}