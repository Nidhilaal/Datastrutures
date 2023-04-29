package array;


import java.util.Scanner;

public class uniquenumberfinding {
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
        System.out.println("Result array:");
        for(int i=0;i<limit;i++){
           int flag=0;
            for(int j=0;j<limit;j++){
                if(arr[i]==arr[j] && i!=j){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(arr[i]);
            }     
        }
    
    }
    
}
