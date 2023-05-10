package sorting;
public class CheckSort {
    
    public boolean check(int [] arr){
        int i=0;
        boolean result=true;
        while(i<arr.length-1){
            if(arr[i]>arr[i+1]){
                result=false;
                break;
            }
            i++;
        }
        return result;

    }
    public static void main(String[] args) {

        int arr[]= {1,2,4,4};
        CheckSort objCheckSort= new CheckSort();
        System.out.println(objCheckSort.check(arr));


    }
    
}
