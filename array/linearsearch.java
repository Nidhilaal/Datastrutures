package array;
public class linearsearch {

    public int search(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={2,4,5,7,8,9};
        linearsearch objLinearsearch=new linearsearch();
        System.out.println("value found at "+objLinearsearch.search(arr, arr.length, 4));
    }
    
}
