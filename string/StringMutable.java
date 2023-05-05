package string;


public class StringMutable {
    public static void main(String[] args) {
        StringBuffer str= new StringBuffer("hello");
        str.append("world");
        System.out.println(str);
        str.replace(0, 4, "manoj");
        System.out.println(str);
    }
    
}
