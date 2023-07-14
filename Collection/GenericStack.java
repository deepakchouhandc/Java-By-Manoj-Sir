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
public class GenericStack {
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s);
        
        Stack<String> s1 = new Stack<>();
        s1.add("Deepak");
        s1.add("Chouhan");
        s1.add(0, "Mr.");
        
        System.out.println(s1);
        
        s1.pop();
        s1.pop();
        System.out.println(s1);
        
                
    }
    
}
