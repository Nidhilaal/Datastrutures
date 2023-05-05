package string;

public class DeleteNumber {

    public static String convert(String str){
        StringBuffer s=new StringBuffer(str);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<48 || s.charAt(i)>57){
                s.deleteCharAt(i);
                i--;
            }   
        }
        return s.toString();

    }
    public static void main(String[] args) {
        String str="9847bv5a6";
        str=convert(str);
        System.out.println(str);
    }
    
}
