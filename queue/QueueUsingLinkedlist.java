package queue;

import java.util.EmptyStackException;

public class QueueUsingLinkedlist {
    private ListNode front;
    private ListNode rear;
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
    public void enqueue(int data){
        ListNode temp=new ListNode(data);
        if(isEmpty()){
            front=temp;
            rear=temp; 
            
            length++; 
        }else{
            rear.next=temp;
            rear=temp;
            temp.next=null;
            length++;
        }
        
    }
    public int dequeue(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int result = front.data;
        front=front.next;
        return result;
      
    }
    public void display(){
        ListNode current=front;
        while(current!=null){
            System.out.print(current.data+ "->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        QueueUsingLinkedlist objQueueUsingLinkedlist=new QueueUsingLinkedlist();

        objQueueUsingLinkedlist.enqueue(5);
        objQueueUsingLinkedlist.display();

        objQueueUsingLinkedlist.enqueue(2);
        objQueueUsingLinkedlist.display();

        objQueueUsingLinkedlist.dequeue();
        objQueueUsingLinkedlist.display();
        
    }
    
}
