package LL;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class TraverseLL {
    
   public static Node convertIntoLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr={2,7,4,9};
       Node res = convertIntoLL(arr);
         while(res!=null){
            System.out.print(res.data+" ");
         res=res.next;
         }
    }
}
