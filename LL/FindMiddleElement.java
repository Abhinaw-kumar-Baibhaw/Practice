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

public class FindMiddleElement {
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
    public static Node findMiddleElement(Node head){
          Node slow = head;
          Node fast = head;
          while(fast!=null && fast.next!=null){
             slow = slow.next;
             fast = fast.next.next;
          }
          return slow;
    }
    public static void main(String[] args) {
        int[] arr={2,5,1,6,7};
       Node head =  convertToLL(arr);
       head = findMiddleElement(head);
       System.out.println(head.data);
    }
}
