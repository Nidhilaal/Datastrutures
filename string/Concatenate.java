package string;

import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        System.out.println("Enter the strings");
        Scanner scan=new Scanner(System.in);
        String s1= scan.nextLine();
        String s2= scan.nextLine();
        scan.close();
        String s3=s1.concat(s2);
        System.out.println(s3);
    }
    
}
