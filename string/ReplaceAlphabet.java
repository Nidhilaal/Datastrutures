package string;

public class ReplaceAlphabet {

    static String replacedString(String str,int n){
        char[] carr=str.toCharArray();
        for(int i=0;i<str.length()-n;i++){
                carr[i]=carr[i+n];
        }
        
        return String.valueOf(carr);
    }
    
    public static void main(String[] args) {
        String str="helloworld"; 
        System.out.println(replacedString(str,2));
        
    }
    
}
