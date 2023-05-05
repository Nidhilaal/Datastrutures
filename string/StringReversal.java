package string;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println("Enter the string to be reversed");
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        String s2="";
        scan.close();
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);   
}
    
}
