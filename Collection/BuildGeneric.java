/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class BuildGeneric {
    
    public static void main(String[] args) {
        Emp e1 = new Emp(1111, "Deepak", 2000000, "java Developer");
        Emp e2 = new Emp(2222, "DDDDD", 1000000, "sdo");
        Emp e3 = new Emp(3333, "CCCCC", 300000, "rsd");
        Emp e4 = new Emp(4444, "HHHHH", 500000, "hno");
        
        Stack<Emp> s = new Stack<>();
        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);
        
        System.out.println(s);
        
        s.pop();
        s.pop();
        
        System.out.println(s);
        
        
    }
    
}
