package LL;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class EvenOddLL {
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
    public static Node evenOdd(Node head){
        Node odd = head;
        Node even = head.next;
        Node evenNodeStart = head.next;
        if(head==null || head.next==null) return head;

        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next = evenNodeStart;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
       Node head = convertToLL(arr);
       head = evenOdd(head);
       while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
       }
    }
}
