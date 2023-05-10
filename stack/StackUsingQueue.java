package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    
    public StackUsingQueue() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
        
    }
    public void push(int data){
        queue1.add(data);  
    }
    public int pop(){
        if(queue1.isEmpty()){
            return -1;
        }
        while(queue1.size()>1){
            queue2.add(queue1.remove());
        }
        int result=queue1.remove();
        Queue<Integer> temp= queue1;
        queue1=queue2;
        queue2=temp;
        return result;    
    }

    public static void main(String[] args) {
        StackUsingQueue objQueue = new StackUsingQueue();
        objQueue.push(5);
        objQueue.push(4);
        objQueue.push(1);
        
        System.out.println(objQueue.queue1);
        System.out.println(objQueue.pop());
        System.out.println(objQueue.queue1);
        
    }
    
}
