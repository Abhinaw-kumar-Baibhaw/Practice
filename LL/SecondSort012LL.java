package LL;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}

public class SecondSort012LL {
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
    public static Node sort012(Node head){
        if(head==null || head.next==null) return head;
        Node z = new Node(-1);
        Node o = new Node(-1);
        Node t = new Node(-1);
        Node zero = z;
        Node one = o;
        Node two = t;   
        Node temp = head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            if(temp.data==2){
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        zero.next = (o.next!=null) ? o.next:t.next;
        one.next = t.next;
        two.next = null;
        return z.next;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,2,1,2,0};
       Node head = convertToLL(arr);
       head = sort012(head);
         while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
         }
    }
}
