package timecomplexity;
public class TimeComplexity {

    public int findsum(int m){
        int sum=0;
        for(int i=0;i<=m;i++){
            sum+=i;
        }
        return sum;
    } 
    
    public static void main(String[] args) {
        double now= System.currentTimeMillis();
        TimeComplexity objTimeComplexity=new TimeComplexity();
        System.out.println( objTimeComplexity.findsum(3500));
        System.out.println("time taken is "+(System.currentTimeMillis()-now)+" millisecs");

    }
}
