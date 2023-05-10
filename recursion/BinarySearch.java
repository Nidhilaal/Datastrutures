package recursion;

public class BinarySearch {
    
    public int search(int arr[],int low,int high,int key){
        int mid=(low+high-1)/2;
        if (arr[mid]==key){
            return mid;
        }
        if(key<mid){
            return search(arr, 0,mid-1, 4);
        }else{
            return search(arr,mid+1, high, key);
        }   
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,6,7,9};
        BinarySearch objBinarySearch=new BinarySearch();
        System.out.println(objBinarySearch.search(arr,0, 6, 4));
               
    }   
}
