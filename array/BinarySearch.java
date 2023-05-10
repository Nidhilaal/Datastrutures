package array;
// binary search can be done only on sorted arrays

public class BinarySearch { 

    public int search(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
           int mid=(high+low)/2;
           if (arr[mid]==key){
            return mid;
           }
           if(key<arr[mid]){
            high=mid-1;  
           }else{
            low=mid+1;
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        BinarySearch objBinarySearch=new BinarySearch();
        System.out.println("value found at "+objBinarySearch.search(arr, 4));
             
    }
    
}
