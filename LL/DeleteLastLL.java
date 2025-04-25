package LL;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class DeleteLastLL {
    public static Node convertToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            Node res = new Node(arr[i]);
            temp.next=res;
            temp=res;
        }
        return head;
    }

    public static Node deleteLast(Node head){
        Node temp = head;
        if(head==null){
            System.out.println("There is no data for deletion");
        }
        while(head.next.next!=null){
           head=head.next;
        }
        head.next =null;
        return temp;
    }
 public static void main(String[] args) {
    int[] arr={3,6,1,9,4};
   Node head =  convertToLL(arr);
  Node res = deleteLast(head);
  while(res!=null){
    System.out.print(res.data+" ");
    res=res.next;
  }
 }   
}
