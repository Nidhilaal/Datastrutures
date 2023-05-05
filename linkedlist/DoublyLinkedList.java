package linkedlist;
import java.util.ArrayList;

public class DoublyLinkedList {
    private static ListNode head;
    private static ListNode tail;
    static int count=0;

    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data=data;
            count++;  
        } 
        
    }

    public void displayForward(){
        if (head==null){
            return;
        }
        ListNode current=head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){
        ListNode current=tail;
        
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.previous;
        }
        System.out.println("null");
    }

    public void insertFirst(int value){
        ListNode newnode=new ListNode(value);
        if (head==null){
            tail=newnode;
        }
        head.previous=newnode;
        newnode.next=head;
        head=newnode;
    }

    public void insertLast(int value){
        ListNode newnode=new ListNode(value);
        if (head==null){
            tail=newnode;
            head=tail;
            return;
        }
        tail.next=newnode;
        newnode.previous=tail;
        tail=newnode;
        
    }

    public void insertMiddle(int value, int pos){
        ListNode newnode=new ListNode(value);
        ListNode back= head;
        if (pos==1){
            insertFirst(value);      
        }
        int m=1;
        while(m<pos-1){
            back=back.next;
            m++;
        }
      newnode.next=back.next;
      back.next.previous=newnode;
      back.next=newnode;
      newnode.previous=back;

    }

    public void deleteFirst(){
        head=head.next;
        head.previous=null;
        count--;
        
    }
    
    public void deleteLast(){
        tail=tail.previous;
        tail.next=null;
        count--;
    }

    public static void main(String[] args) {
        
        DoublyLinkedList objDoublylinkedlist= new DoublyLinkedList();
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(5);
        al.add(4);
        al.add(1);
        for (int i : al) {
                objDoublylinkedlist.insertLast(i);
        }
    
        objDoublylinkedlist.displayForward();
        System.out.println("count is "+DoublyLinkedList.count);
  
        objDoublylinkedlist.insertFirst(10);
        objDoublylinkedlist.displayForward(); 
        System.out.println("count is "+DoublyLinkedList.count);

        objDoublylinkedlist.insertLast(5);
        objDoublylinkedlist.displayForward();
        System.out.println("count is "+DoublyLinkedList.count);

        objDoublylinkedlist.insertMiddle(4,2);
        objDoublylinkedlist.displayForward();
        System.out.println("count is "+DoublyLinkedList.count);

        objDoublylinkedlist.deleteFirst();
        objDoublylinkedlist.deleteLast();

        objDoublylinkedlist.displayForward();
        System.out.println("count is "+DoublyLinkedList.count);

        objDoublylinkedlist.displayForward();
        System.out.println("count is "+DoublyLinkedList.count);
        
 
    }
    
}
