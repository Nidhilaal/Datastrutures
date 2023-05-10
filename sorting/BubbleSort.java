package sorting;

import java.util.Scanner;

public class BubbleSort {
    public void bsort(int arr[]){
        boolean isSwapped;
        for(int i=0;i<arr.length-1;i++){
            isSwapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false){
                break;
            }
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

        BubbleSort objBubbleSort=new BubbleSort();
        objBubbleSort.bsort(arr);

        System.out.println("Sorted array");
        for (int i : arr) {
            System.out.println(i);
            
        }

    }
   
}
