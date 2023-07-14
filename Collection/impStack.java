/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class impStack {
    
    public static void main(String[] args) {
        
        Stack stk = new Stack();
        
        stk.push("Indore");
        stk.push("Pune");
        stk.push("Baglore");
        stk.push("Noida");
        stk.push("Chennia");
        
        System.out.println(stk);
        
        stk.pop();
        stk.pop();
        System.out.println(stk);
        
        
    }
    
}
