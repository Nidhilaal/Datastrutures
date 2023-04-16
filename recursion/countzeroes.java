package recursion;

public class countzeroes {

    static int zero(int n){
        if(n==0){
            return 0;
        }
        if(n%10==0){
            return 1+zero(n/10);
        }else{
            return zero(n/10);
        }
    }
        

    public static void main(String[] args) {
    
        System.out.println(zero(10502005));
        
    }

    
}
