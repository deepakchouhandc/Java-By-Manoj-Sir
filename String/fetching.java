/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author ASUS
 */
public class fetching {
    
    public static void main(String[] args) {
        String s = "deepakchouhan@";
        
//        char ch = s.charAt(8);
//        System.out.println(ch);

        System.out.println(s.length());
        
        char ch1[] = s.toCharArray();
        byte b[] = s.getBytes();
        
        for(char c :ch1)
        {
            System.out.println(c);
            
            
        }
        
        for(byte bb: b)
        {
            System.out.println(bb);
        }
        
        
    }
    
    
    
}
