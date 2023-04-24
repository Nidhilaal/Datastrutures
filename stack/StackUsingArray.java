package stack;

public class StackUsingArray {
    int capacity=5;
    int[] stack=new int[capacity];
    private int top=0;

    public void push(int data){
        if(top==capacity){
            System.out.println("stack is full");

        }else{
        stack[top]=data;
        top++;
        }
    }
    public int pop(){
        top--;
        int result=stack[top];
        stack[top]=0;
        return result;
        
    }
    public void display(){
        System.out.println("Updated stack");
        for (int i : stack) {
            System.out.print(i +" ");
            
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        StackUsingArray obj= new StackUsingArray();
        obj.push(5);
        obj.push(6);
        obj.push(5);
        obj.push(6);
        obj.push(2);
        obj.push(5);

        obj.display();
        obj.pop();
        obj.display();
        
    }
    
}
