package stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String str){
        Stack <Character> stack= new Stack <Character> ();
        for (char c : str.toCharArray()) {
            if( c=='('|| c=='[' || c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top= stack.peek();
                    if(c==')' && top=='('|| c==']' && top=='['||c=='}' && top=='{'){
                        stack.pop();
                    }else{
                        return false;
                    }

                }
            }
            
        }
        return stack.isEmpty();         
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scan= new Scanner(System.in);
        String str =scan.nextLine();
        scan.close();
        ValidParentheses objValidParentheses=new ValidParentheses();
        System.out.println(objValidParentheses.isValid(str));

    }
    
}
