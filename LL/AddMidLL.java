package LL;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class AddMidLL {
    public static Node convertToLL(int[] arr){
        Node res = new Node(arr[0]);
        Node head = res;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            head.next = temp;
            head = temp;
        }
        return res;
    }

    public static Node addMid(Node head, int data,int position){
        Node res = new Node(data);
        Node temp = head;
        if(head==null){
           return res;
        }
       int c=1;
        while(head.next!=null && c < position){
                head = head.next;
                c++; 
        }
        res.next=head.next;
        head.next=res;
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        Node head = convertToLL(arr);
       Node res = addMid(head,3,2);
       while(res!=null){
        System.out.print(res.data+" ");
        res=res.next;
       }
    }
}
