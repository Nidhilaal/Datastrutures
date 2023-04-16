package timecomplexity;
public class timecomplexity {

    public int findsum(int m){
        int sum=0;
        for(int i=0;i<=m;i++){
            sum+=i;
        }
        return sum;
    } 
    
    public static void main(String[] args) {
        double now= System.currentTimeMillis();
        timecomplexity objTimecomplexity1=new timecomplexity();
        System.out.println( objTimecomplexity1.findsum(3500));
        System.out.println("time taken is "+(System.currentTimeMillis()-now)+" millisecs");

    }
}
