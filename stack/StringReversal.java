package stack;

import java.util.Scanner;
import java.util.Stack;

public class StringReversal {
    public String reverse(String str){
        Stack <Character> stack=new Stack<Character>();
        char[] chararr=str.toCharArray();
        for (char c : chararr) {
            stack.push(c);
            
        }
        for(int i=0;i<chararr.length;i++){
            chararr[i]=stack.pop();
        }
        return new String(chararr);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        String str=scan.nextLine();
        scan.close();
        StringReversal objStringReversal=new StringReversal();
        System.out.println(objStringReversal.reverse(str));
        }
    
}
