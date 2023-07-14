/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.StringTokenizer;


/**
 *
 * @author ASUS
 */
public class StringTokenizerExample {
    
    public static void main(String[] args) {
        
        String s = "java, c;pp, pyt;hon, php orcal";
        
        StringTokenizer st  = new StringTokenizer(s ,", ; o");
        
        System.out.println(st.countTokens());
        
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        
        System.out.println(st.countTokens());
        
    }
    
}
