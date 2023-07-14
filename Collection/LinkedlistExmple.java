/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.LinkedList;

/**
 *
 * @author ASUS
 */
public class LinkedlistExmple {
    
    public static void main(String[] args) {
        
       LinkedList list = new LinkedList();
       
       list.add("Deepak");
       list.add("Chouhan");
       list.add("super");
       list.addFirst("Mr.");
       list.addLast("Java Developer");
       list.add("cool");
       
        System.out.println(list);
        
        list.remove();
        list.removeFirst();
        
        
        System.out.println(list);
        
        list.removeLast();
        
        System.out.println(list);
        
        list.remove(1);
        
        System.out.println(list);
        
        list.add("Deepak")      ;
        System.out.println(list);
        
        
       
    }
    
}
