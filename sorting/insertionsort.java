package sorting;

import java.util.Scanner;

public class insertionsort {
    public void isort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the limit:");
        int limit=scan.nextInt();
        int arr[]=new int[limit];
        System.out.println("enter the elements:");
        for(int i=0;i<limit;i++){
            arr[i]=scan.nextInt();    
        }
        scan.close();
        insertionsort objInsertionsort=new insertionsort();
        objInsertionsort.isort(arr);
        System.out.println("Sorted array");
        for (int i : arr) {
            System.out.println(i);
            
        }

        
    }
    
}
