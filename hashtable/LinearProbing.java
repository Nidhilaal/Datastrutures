package hashtable;

public class LinearProbing {
    private HashNode[] buckets;
    private int numOfBuckets;

    public LinearProbing(int capacity){
        this.numOfBuckets= capacity;
        buckets=new HashNode[capacity];
    }
    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value){
            this.key=key;
            this.value=value;
        }
    }
    public int getbucketindex(Integer key){
        return key% numOfBuckets;
    }
    public void put (Integer key,String value){
        int bucketindex=getbucketindex(key);
        int i=0;
        while(buckets[(bucketindex+i)%numOfBuckets]!=null){
            if(buckets[(bucketindex+i)%numOfBuckets].key.equals(key)){
                buckets[(bucketindex+i)%numOfBuckets].value=value;
                return;
            }
            i++;
        }
        HashNode node= new HashNode(key, value);
        node.next=buckets[(bucketindex+i)%numOfBuckets];
        buckets[(bucketindex+i)%numOfBuckets]=node;
    }
    public String get(Integer key){
        int i=0;
        int bucketindex= getbucketindex(key);
        while(buckets[(bucketindex+i)%numOfBuckets]!=null){
            if(buckets[(bucketindex+i%numOfBuckets)].key.equals(key)){
                return buckets[(bucketindex+i%numOfBuckets)].value;
            }
            i++;
        }
        return null;
    }
    public static void main(String[] args) {
        LinearProbing table=new LinearProbing(5);
      
        table.put(1, "John");
        table.put(21, "Smith");
        table.put(10, "George");
        table.put(11, "Scott");
        System.out.println(table.get(21));
        System.out.println(table.get(11));
        
        
    }
    
}
