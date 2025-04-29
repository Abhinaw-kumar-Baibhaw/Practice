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

public class Sort012LL {
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
        if(head==null) return head;
        int zero=0;
        int one=0;
        Node res = head;
        Node temp = res;
        while(head!=null){
            if(head.data==0){
                zero = zero+1;
            }
            if(head.data==1){
                one++;
            }
            head=head.next;
        }
        while(res!=null){
            if(zero!=0){
                res.data=0;
                zero--;
            }
            else if(one!=1){
               res.data=1;
               one--;
            }
            else{
                res.data=2;
            }
            res=res.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,1,0,2,1};
        Node head = convertToLL(arr);
        head = sort012(head);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
