package LL;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class AddLastLL {
   public static Node convertToLL(int[] arr){
    Node temp = new Node(arr[0]);
    Node head = temp;
     for(int i=1;i<arr.length;i++){
        Node temp1 = new Node(arr[i]);
        head.next=temp1;
        head=temp1;
     }
     return temp;
   }

   public static Node addLast(Node head,int data){
    Node temp = head;
    Node res = new Node(data);
       if(head==null){
        return res;
       }
       while(temp.next!=null){
        temp=temp.next;
       }
       temp.next = res;
      return head;
   }

    public static void main(String[] args) {
        int[] arr={2,5,3,1,8};
        Node head = convertToLL(arr);
       Node res=  addLast(head,9);
        while(res!=null){
            System.out.print(res.data +" ");
            res=res.next;
        }
    }
}