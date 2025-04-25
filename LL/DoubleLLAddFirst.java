package LL;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data,Node next,Node prev){
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

public class DoubleLLAddFirst {
    public static Node convertTo2L(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    public static Node addFirst2L(Node head,int data){
        Node res = new Node(data);
        if(head==null){
           return res;
        }
        if(head!=null){
            res.next=head;
            head.prev=res;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={2,5,9,3,7};
       Node res = convertTo2L(arr);
       res = addFirst2L(res,8);
       while(res!=null){
        System.out.print(res.data+" ");
        res=res.next;
       }
    }
}
