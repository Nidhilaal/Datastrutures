package sorting;

import java.util.Scanner;

public class selectionsort {
    public void sSort(int arr[]){
       
        for(int i =0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;      
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
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
        selectionsort objSelectionsort=new selectionsort();
        objSelectionsort.sSort(arr);
        System.out.println("sorted array");
        for (int i : arr) {
            System.out.println(i);
            
        }
        
    }
    
}
