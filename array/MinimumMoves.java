package array;


import java.util.Scanner;

public class MinimumMoves {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the limit:");
        int limit=scan.nextInt();
        int arr[]=new int[limit];
        System.out.println("enter the elements:");
        for(int i=0;i<limit;i++){
            arr[i]=scan.nextInt();    
        }
        scan.close(); 
        int max=arr[0];
        for(int i=0;i<limit;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count=0;
        for(int i=0;i<limit;i++){
            if(arr[i]<max){
                count++;
                arr[i]++;
            }else{
                continue;
            }
        }
        System.out.println("minimum moves required to make all the elements equal is "+count);
    }
   
    
}
