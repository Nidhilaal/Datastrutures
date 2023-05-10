package array;

import java.util.Scanner;

public class RemoveEven {
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
        int oddcount=0;
        for(int i=0;i<limit;i++){
            if(arr[i]%2!=0){
                oddcount++;
            }

        }
        int[] temp= new int[oddcount];
        int idx=0;
        for(int i=0;i<limit;i++){
            if(arr[i]%2!=0){
                temp[idx]=arr[i];
                idx++;
            }
        }
        System.out.println("result");
        for (int i : temp) {
            System.out.println(i);
            
        }
        
    }
    
}
