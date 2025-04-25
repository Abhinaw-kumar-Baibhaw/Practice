package LL;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class DeleteMidLL {

    public static Node convertToLL(int[] arr){
        Node res =  new Node(arr[0]);
        Node head = res;
        for(int i =1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            head.next=temp;
            head=temp;
        }
        return res;
    }

    public static Node deleteMid(Node head, int position){
        Node temp = head;
        if(head == null){
            System.out.println("there is no any data");
        }
        int c=0;
        while(head.next!=null && c < position-2){
            head = head.next;
            c++;
        }
        head.next = head.next.next;
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       Node head = convertToLL(arr);
       Node res = deleteMid(head,3);
       while(res!=null){
        System.out.print(res.data+" ");
        res=res.next;
       }
    }
}
