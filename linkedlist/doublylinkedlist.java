package linkedlist;
import java.util.ArrayList;

public class doublylinkedlist {
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

    public void displayforward(){
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

    public void displaybackward(){
        ListNode current=tail;
        
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.previous;
        }
        System.out.println("null");
    }

    public void insertfirst(int value){
        ListNode newnode=new ListNode(value);
        if (head==null){
            tail=newnode;
        }
        head.previous=newnode;
        newnode.next=head;
        head=newnode;
    }

    public void insertlast(int value){
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

    public void insertmiddle(int value, int pos){
        ListNode newnode=new ListNode(value);
        ListNode back= head;
        if (pos==1){
            insertfirst(value);      
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

    public void deletefirst(){
        head=head.next;
        head.previous=null;
        count--;
        
    }
    
    public void deletelast(){
        tail=tail.previous;
        tail.next=null;
        count--;
    }

    public static void main(String[] args) {
        
        doublylinkedlist objDoublylinkedlist= new doublylinkedlist();
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(5);
        al.add(4);
        al.add(1);
        for (int i : al) {
                objDoublylinkedlist.insertlast(i);
        }
    
        objDoublylinkedlist.displayforward();
        System.out.println("count is "+doublylinkedlist.count);
  
        objDoublylinkedlist.insertfirst(10);
        objDoublylinkedlist.displayforward(); 
        System.out.println("count is "+doublylinkedlist.count);

        objDoublylinkedlist.insertlast(5);
        objDoublylinkedlist.displayforward();
        System.out.println("count is "+doublylinkedlist.count);

        objDoublylinkedlist.insertmiddle(4,2);
        objDoublylinkedlist.displayforward();
        System.out.println("count is "+doublylinkedlist.count);

        objDoublylinkedlist.deletefirst();
        objDoublylinkedlist.deletelast();

        objDoublylinkedlist.displayforward();
        System.out.println("count is "+doublylinkedlist.count);

        objDoublylinkedlist.displayforward();
        System.out.println("count is "+doublylinkedlist.count);
        
 
    }
    
}
