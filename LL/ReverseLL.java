package LL;

import java.util.Stack;

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

public class ReverseLL {
    public static Node convertToLL(int[] arr){
        Node res = new Node(arr[0]);
        Node head =  res;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            res.next=temp;
            res=temp;
        }
        return head;
    }

    public static Node reverseLL(Node head){
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp!=null){
           st.push(temp.data);
           temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            temp.data = st.peek();
            st.pop();
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       Node head = convertToLL(arr);
       head = reverseLL(head);
       while(head!=null){
        System.out.print(head.data+" ");
        head = head.next;
       }
    }
}