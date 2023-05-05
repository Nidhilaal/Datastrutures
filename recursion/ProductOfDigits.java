package recursion;

public class ProductOfDigits. {
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return n%10 * prod(n/10);

    } 
    public static void main(String[] args) {
        int a=prod(1324);
        System.out.println(a);
        
    }
    
}
