package String;

public class StringExample {
    
    public static void main(String[] args) {
        
        String s1 = new String("deepak");
        String s2 = new String("deepak");
        
        
        String s4 = "chouhan";
        String s3 = "chouhan";
        
        
        
        // here == operator check the reference of the or we can say that check the address of the s1 and s2 / s3 and s4
        System.out.println(s1==s2);
        System.out.println(s4==s3);
        
        // here equals method check the content of the reference of the variable 
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        
        
        
    }
    
}
