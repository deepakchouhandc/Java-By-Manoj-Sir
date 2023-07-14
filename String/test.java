/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author ASUS
 */
public class test {
    
    public static void main(String[] args) {
        
        String s1 = new String("Deepak Chouhan");
        System.out.println(s1);
        
        char ch[] = {'a','b','c','d','e','f','g'};
        
        String s2 = new String(ch);
        System.out.println(s2);
        
        String s3 = new String(ch,2,5);
        System.out.println(s3);
        
        
        byte b[] = {65,66,67,68,69,70,71,72};
        
        String s4 = new String(b);
        System.out.println(s4);
        
        
        String s5 = new String(b,3,3);
        System.out.println(s5);
        
        
    }
    
}
