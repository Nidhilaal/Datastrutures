package array;

import java.util.Scanner;

public class arrayreversal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the limit");
        int limit=scan.nextInt();
        int arr[]=new int[limit];
        System.out.println("enter the elements");
        for(int i=0;i<limit;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();
        int start=0;
        int end=limit-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("result");
        for (int i : arr) {
            System.out.println(i);
            
        }
        
    }
    
}
