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

public class AddTwoNumLL {
    public static Node convertToLL(int[] arr){
        Node res = new Node(arr[0]);
        Node head = res;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            res.next = temp;
            res=temp;
        }
        return head;
    }

    public static Node addTwoNum(Node head1, Node head2){
        Node t1 = head1;
        Node t2 = head2;
        Node dummyNode = new Node(-1);
        Node current = dummyNode;
        int carry = 0;
        while(t1!=null || t2!=null){
          int sum = carry;
          if(t1!=null){
                sum = sum + t1.data;
          }
          if(t2!=null){
            sum = sum + t2.data;
          }
          Node newNode = new Node(sum % 10);
          carry = sum/10;
          current.next=newNode;
          current=current.next;
          if(t1!=null){
            t1=t1.next;
          }
          if(t2!=null){
            t2=t2.next;
          }
        }
        if(carry!=0){
            Node newNode = new Node(carry);
            current.next=newNode;
        }
        return dummyNode.next;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,9,9};
        int[] arr1 = {3,5};
       Node head =  convertToLL(arr);
       Node head1 = convertToLL(arr1);
       Node head2 = addTwoNum(head,head1);
       while(head2!=null){
        System.out.print(head2.data+" ");
        head2 = head2.next;
       }
    //    System.out.println();
    //    while(head1!=null){
    //     System.out.print(head1.data+" ");
    //     head1 = head1.next;
    //    }
    }
}
