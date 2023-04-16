//Duplicates cannot be compared


package string;

public class patternmatching {
  
    public static void main(String[] args) {
        String text="helloworld";
        String pattern="worl";
        char c,p;
        int count=0;

        for(int i=0;i<=text.length()-pattern.length();i++){
           
            c=text.charAt(i);
            p=pattern.charAt(0);
            if (c==p){
                for(int j=i,k=0;j<i+pattern.length();j++,k++){
                    c=text.charAt(j);
                    p=pattern.charAt(k);
                    if (c==p){
                        count++;
                    }
                 
                 }
            }
        }
        if(count==pattern.length()){
            System.out.println(count);
            System.out.println("pattern found");

        }else{
            System.out.println(count);
            System.out.println("Not found");
        }
    }
    
}
