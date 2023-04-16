package array;

import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
         
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=scan.nextInt();
        int arr[]=new int[rows];
        System.out.println("enter the elements");
        for(int i=0;i<rows;i++){
           arr[i]=scan.nextInt();
        }
        scan.close();
        for (int i=0;i<rows;i++){
            for(int j=i+1;j<rows;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array");
        for (int k : arr) {
            System.out.println(k);    
        }
    }
    
}
