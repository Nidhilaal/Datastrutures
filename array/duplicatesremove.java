package array;

import java.util.Scanner;

public class duplicatesremove {
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
        for(int i=0;i<limit;i++){
            for(int j=i+1;j<limit;j++){
                if(arr[i]==arr[j]){
                    for(int k=j;k<limit;k++){
                        arr[k]=arr[k+1];
                    }
                    limit--;
                    i--;
                }
            }
        }
    }
    
}
