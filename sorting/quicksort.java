package sorting;

import java.util.Scanner;

public class quicksort {
    public void qSort(int[] arr,int low,int high){
        if(low<high){
            int p=partition(arr, low, high);
            qSort(arr, low, p-1);
            qSort(arr, p+1, high);

        }
       
    }
    public int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int j=low;
        int i=low;
        while(i<=high){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;

            }
            i++;
        }
        return j-1;
        
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

        quicksort objQuicksort=new quicksort();
        objQuicksort.qSort(arr, 0, arr.length-1);
        System.out.println("Result array");
        for (int i : arr) {
            System.out.println(i);
            
        }
        
    }
    
}
