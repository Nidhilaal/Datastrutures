package string;

import java.util.Scanner;

public class palindrome {

    static boolean palin(String word){
        char[] carr=word.toCharArray();
        int  start=0;
        int end=word.length()-1;
        while(start<end){
            if(carr[start]!=carr[end]){
                return false;   
            }  
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string to be checked");
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        scan.close();
        if(palin(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
              
    }
    
}
