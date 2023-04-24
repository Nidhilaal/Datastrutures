package sorting;

import java.util.Scanner;

public class mergesort {
    
    public void mSort(int arr[],int[] temp,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mSort(arr, temp, low, mid);
            mSort(arr, temp, mid+1, high);
            merge(arr,temp,low,mid,high);
        }
    }

    public void merge(int arr[],int temp[],int low,int mid,int high){
        for(int i=low;i<=high;i++){
            temp[i]=arr[i];
        }
        int i=low;
        int j=mid+1;
        int k=low;
        while(i<=mid && j<=high){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k]=temp[i];
            i++;
            k++;
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
        mergesort objMergesort=new mergesort();
        objMergesort.mSort(arr,new int[arr.length],0,arr.length-1);
        System.out.println("Result array");
        for (int i : arr) {
            System.out.println(i);
            
        }
        
        
    }
    
}


