package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackUsingLinkedList {
    private ListNode top;
    private int length;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next=null;
        }
        
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
        ListNode temp= new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }
    public void display(){
        ListNode current=top;
        while(current!=null){
            System.out.print(current.data+ "->");
            current=current.next;
        }
        System.out.println("null");
    }
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void displayfromlast(ListNode top){
        if(top ==null){
            return;
        }
        displayfromlast(top.next);
        System.out.print(top.data+" ");
    }

    public static void main(String[] args) {
        StackUsingLinkedList objSamplestack=new StackUsingLinkedList();
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(2);
        al.add(3);
        al.add(4);
        for (Integer i : al) {
            objSamplestack.push(i);
        }  

        objSamplestack.display();
        System.out.println( objSamplestack.pop()); 
        objSamplestack.display();
        System.out.println(objSamplestack.peek());  
        objSamplestack.displayfromlast(objSamplestack.top);
        
    }
    
}
