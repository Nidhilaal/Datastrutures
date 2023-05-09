package heap;

public class MinHeap {
    Integer[] heap;
    private int n;
     
    public MinHeap(int capacity){
        heap=new Integer[capacity+1];
        n=0;
    }

    public void insert(int value){
        if(n==heap.length-1){
            resize(2*heap.length-1);
        }
        n++;
        heap[n]=value;
        swim(n);
    }

    public void swim(int k){
        while(k>1 && heap[k/2]>heap[k]){
            int temp=heap[k/2];
            heap[k/2]=heap[k];
            heap[k]=temp;
            k=k/2;
        }
    }

    public void resize(int capacity){
        Integer[] temp= new Integer[2*capacity];
        for(int i=0;i<heap.length;i++){
            temp[i]=heap[i];
        }
        heap=temp;
    }

    public void display(){
        for (Integer i : heap) {
            if(i==null){
                continue;
            }
            System.out.print(i+" ");        
        }
    }

    public int deleteMin(){
        int min=heap[1];
        swap(1,n);
        n--;
        heap[n+1]=null;
        sink(1);
        if(n>0 && n==(heap.length-1)/4){
            resize(heap.length/2);
        }
        return min;
    }

    public void sink(int k){
        while(2*k<n){
            int j=2*k;
            if(k>0 && heap[j]>heap[j+1]){
                j++;
            }
            if(heap[k]<=heap[j]){
                break;
            }
            swap(k,j);
            k=j;
        }
    }

    public void swap(int a,int b){
        int temp=heap[a];
        heap[b]=heap[a];
        heap[a]=temp;
    }

    public static void main(String[] args) {
        MinHeap objMinHeap=new MinHeap(4);
        objMinHeap.insert(2);
        objMinHeap.insert(4);
        objMinHeap.insert(5);
        objMinHeap.insert(1);
        objMinHeap.insert(7);

        objMinHeap.display();
        System.out.println();

        System.out.println(objMinHeap.deleteMin());

        objMinHeap.display();
        
    }
    
}
