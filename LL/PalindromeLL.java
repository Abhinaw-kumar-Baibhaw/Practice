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

public class PalindromeLL {

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
    public static void main(String[] args) {
        int[] arr = {1,2,1};
       Node head = convertToLL(arr);
       while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
       }
    }
}
