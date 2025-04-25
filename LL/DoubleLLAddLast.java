package LL;

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

public class DoubleLLAddLast {
    public static Node convertTo2L(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
       for(int i=1;i<arr.length;i++){
        Node temp = new Node(arr[i],null,prev);
        head.next=temp;
        head=temp;
       }
     return prev;
    }

    public static Node addToLast(Node head,int data){
        Node res = new Node(data);
        Node temp = head;
        if(head==null){
            return res;
        }
        while(head.next!=null){
            head = head.next;
        }
        head.next=res;
        res.prev=head;
        return temp;
    }

public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
   Node head = convertTo2L(arr);
   head = addToLast(head,6);
    while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
    }
  }    
}