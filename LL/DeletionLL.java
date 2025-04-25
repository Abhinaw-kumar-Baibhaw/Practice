package LL;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class DeletionLL {

    public static Node convertToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }

    public static Node deleteFirst(Node head){
        if(head == null){
            return head;
        }
         head = head.next;
        return head;
    }

    public static Node insertFirst(int data,Node head){
        Node res = new Node(data);
        if(head==null){
            return res;
        }
        res.next=head;
        head=res;
        return head;
    }
    public static void main(String[] args) {
        int[] arr={4,9,2,6};
        Node head = convertToLL(arr);
        // Node head = deleteFirst(res);
        // while(head!=null){
        //     System.out.print(head.data+" ");
        //     head=head.next;
        // }
        head = insertFirst(7,head);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
