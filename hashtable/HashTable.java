package hashtable;

public class HashTable {

    private HashNode[] buckets;
    private int numOfBuckets;

    public HashTable(int capacity) {
        this.numOfBuckets=capacity;
        buckets= new  HashNode[capacity];
    }

    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
            
    }
    public int getbucketindex(Integer key){
        return key %numOfBuckets;
    }
    public void put(Integer key,String value){
        if(key==null || value== null){
            throw new IllegalArgumentException("key is null");
        }
        int bucketindex=getbucketindex(key);
        HashNode head=buckets[bucketindex];
        while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
        head=buckets[bucketindex];
        HashNode node=new HashNode(key, value);
        node.next=head;
        buckets[bucketindex]=node;

    }
    public String get(Integer key){
        int bucketindex=getbucketindex(key);
        HashNode head = buckets[bucketindex];
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }  
            head=head.next;
        }
        return null;

    }
    
    public static void main(String[] args) {
        HashTable table= new HashTable(10);

        table.put(1, "John");
        table.put(21, "Smith");
        table.put(1, "George");
        table.put(3, "Scott");
        System.out.println(table.get(21));
        System.out.println(table.get(1));
        
    }
    
}
