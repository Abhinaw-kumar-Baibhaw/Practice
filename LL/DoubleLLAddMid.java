package LL;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data,Node next, Node prev){
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

public class DoubleLLAddMid {
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
    public static Node addMid2L(Node head,int postion,int data){
        Node res = new Node(data);
        Node temp = head;
          if(head==null || postion <=1){
            res.next=head;
            if(head!=null){
                head.prev=res;
            }
             return res;
          }
          int c=1;
          while(head.next!=null && c < postion){
            head=head.next;
            c++;
          }
          res.next=head.next;
          head.next.prev=res;
          res.prev=head;
          head.next=res;
          return temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
       Node head = convertTo2L(arr);
       head = addMid2L(head,0,3);
       while(head!=null){
        System.out.print(head.data+" ");
        head = head.next;
       }
    }
}