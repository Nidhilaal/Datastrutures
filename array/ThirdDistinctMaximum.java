package array;

import java.util.Scanner;

public class ThirdDistinctMaximum {

    public void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public int find(int[] arr){
        sort(arr);
        int count=0;
        int pos=0;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                count++;
                if(count==2){
                    pos=i-1;
                    break;
                }else{
                    pos=arr.length-1;
                }
            }
        }
        return arr[pos];
        
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limits");
        int limit= scan.nextInt();
        int arr[]=new int[limit];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();

        ThirdDistinctMaximum objDistinctMaximum = new ThirdDistinctMaximum();
        System.out.print("Result is: ");
        System.out.println(objDistinctMaximum.find(arr));
  
    }
    
}
