package queue;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    
    public QueueUsingStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    public void enqueue(int data){
        stack1.push(data);
    }
    public int dequeue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            return-1;
        }
        return stack2.pop();
        
    }
    public int peek(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            return-1;
        }
        return stack2.peek();
        
    }
    public void display(){
        if(stack1.isEmpty()){
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            System.out.println(stack1);
        }else{
            System.out.println(stack1);
        }
    }

    public static void main(String[] args) {
        QueueUsingStack objQueueUsingStack=new QueueUsingStack();
        objQueueUsingStack.enqueue(5);
        objQueueUsingStack.enqueue(4);
        objQueueUsingStack.enqueue(6);
        
        System.out.println(objQueueUsingStack.dequeue());
        objQueueUsingStack.display();
        System.out.println(objQueueUsingStack.peek());
        
        
    }
    
}
