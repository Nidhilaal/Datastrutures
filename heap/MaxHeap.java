package heap;

public class MaxHeap {
    Integer[] heap;
    private int n;
     
    public MaxHeap(int capacity){
        heap= new Integer[capacity+1];
        n=0;
    }
    
    public void insert(int value){
        if(n==heap.length-1){
            resize(2*heap.length);
        }
        n++;
        heap[n]=value;
        swim(n);
    }

    public void swim(int k){
        while(k>1 && heap[k/2]<heap[k]){
            int temp=heap[k/2];
            heap[k/2]= heap[k];
            heap[k]=temp;
            k=k/2;
        }

    }

    private void resize(int capacity) {
        Integer[] temp=new Integer[2*capacity];
        for(Integer i=0;i<heap.length;i++){
            temp[i]=heap[i];
        }
        heap=temp;
    }

    public int deleteMax(){
        int max=heap[1];
        swap(1,n);
        n--;
        sink(1);
        heap[n+1]=null;
        if(n>0 && n==(heap.length-1)/4){
            resize(heap.length/2);
        }
        return max;
        
    }

    public void sink(int k){
        while(2*k<n){
            int j= 2*k;
            if(k>0 && heap[j]<heap[j+1]){
                j++;
            }
            if(heap[k]>=heap[j]){
                break;
            }
            swap(k,j);
            k=j;
        }
       
    }

    public void swap(int a,int b){
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }

    public static void main(String[] args) {
        MaxHeap objMaxHeap= new MaxHeap(4);

        objMaxHeap.insert(5);
        objMaxHeap.insert(4);
        objMaxHeap.insert(1);
        objMaxHeap.insert(8);
        objMaxHeap.insert(6);

        System.out.println(objMaxHeap.deleteMax());

        for (Integer i : objMaxHeap.heap) {
            if(i==null){
                continue;
            }
            System.out.print(i+" ");
        }
    }
    
}
