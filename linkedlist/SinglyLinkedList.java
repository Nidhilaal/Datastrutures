package linkedlist;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList {
    private ListNode head;
    static int count=0;
    private static class ListNode{
        private   int data;  
        private ListNode next;

        public ListNode(int data) { 
            this.data = data;
            this.next = null;  
            count++;
        }
    }

    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }        
        System.out.println("null");  
    }

    public void insertFirst(int value){
        ListNode newnode=new ListNode(value);
        newnode.next=head;
        head=newnode;  
    }
     
    public  void insertEnd(int value){
        ListNode newnode=new ListNode(value);
        if(head==null){
            head=newnode;
            return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
    }

    public void insertMiddle(int value,int pos){
        ListNode node=new ListNode(value);
        if (pos==1){
            node.next=head;
           head=node;
        }else{
            int m=1;
            ListNode previous =head;
            while(m<pos-1){
                previous=previous.next;
                m++;
            }
            ListNode temp=previous.next;
            previous.next=node;
            node.next=temp;
        }
    }

    public void deleteFirst(){
        head=head.next;
        count--;
        
    }

    public void deleteLast(){
        ListNode current= head;
        ListNode previous =null;
    
        while(current.next!=null){
             previous=current;
            current=current.next;
        }
        previous.next=null;
        count--;
    }

    public void deleteValue(int value){
        ListNode current= head;
        ListNode previous=null;
        if (head==null|| head.next==null){
            return;
        }
    
        while(current.next!=null){
            if( current.data==value ){  
                if (previous!=null){       
                    previous.next=current.next;
                    count--;
                }else{
                deleteFirst();
                }
            }else{
                previous=current;
            } 
            current=current.next;     
        } 
        if (current.data==value){
            deleteLast();
            return;
        }
    }

    public void removeDuplicate(){
        ListNode current = head;
        ListNode previous = null;
        Set <Integer> set = new HashSet<>();
        while(current != null){
            if(set.contains(current.data)){
                previous.next = current.next;
                count--;
            }else{
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    } 

    public void removeDuplicateOfSortedList(){
        ListNode current=head;
        while (current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
                count--;   
            }
            current=current.next;
    
        }
    }

    public void insertBefore(int value,int searchvalue){
        ListNode newnode=new ListNode(value);
        ListNode current= head;
        ListNode previous=null;
        while (current.data!=searchvalue){
            previous=current;
            current=current.next;
        }
        previous.next=newnode;
        newnode.next=current;
    }

    public void insertAfter(int value,int searchvalue){
        ListNode newnode=new ListNode(value);
        ListNode current=head;
        ListNode nextnode= head.next;
        while(current.data!=searchvalue){
            nextnode=current.next;
            current=current.next;    
        }
        current.next=newnode;
        newnode.next=nextnode;
    }

    public void reverse(){
        ListNode previous=null;
        while (head!=null){
            ListNode next=head.next;  
            head.next=previous;
            previous =head; 
            head=next;
        }
        head=previous;     
    }

    public static void main(String[] args) {
        SinglyLinkedList objSinglyLinkedList= new SinglyLinkedList();
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.add(1);
        al.add(1);
        al.add(2);
        al.add(5);
        al.add(5);
        al.add(7);
        al.add(7);
        for (int i : al) {
            objSinglyLinkedList.insertEnd(i); 
        }

        objSinglyLinkedList.display();
        System.out.println("count is "+SinglyLinkedList.count);  
        
        objSinglyLinkedList.insertFirst(4);
        objSinglyLinkedList.display();
        System.out.println("count is "+SinglyLinkedList.count);  

        objSinglyLinkedList.insertEnd(5);
        objSinglyLinkedList.display();
        System.out.println("count is "+SinglyLinkedList.count); 

        objSinglyLinkedList.insertMiddle(4, 3);
        objSinglyLinkedList.insertMiddle(7, 5);

        objSinglyLinkedList.display();
        System.out.println("count is "+SinglyLinkedList.count); 

        objSinglyLinkedList.deleteFirst();
        objSinglyLinkedList.display();
        System.out.println("count is "+SinglyLinkedList.count);

        objSinglyLinkedList.deleteLast();
        objSinglyLinkedList.display();
        System.out.println("count is "+ SinglyLinkedList.count);

        objSinglyLinkedList.insertBefore(1,5);
        objSinglyLinkedList.display();
        System.out.println("count is "+SinglyLinkedList.count);


        objSinglyLinkedList.deleteValue(7);
        objSinglyLinkedList.display();
        System.out.println("count is "+SinglyLinkedList.count);

        objSinglyLinkedList.reverse();
        objSinglyLinkedList.display();
        System.out.println("count is "+SinglyLinkedList.count);
        
    }      
}


