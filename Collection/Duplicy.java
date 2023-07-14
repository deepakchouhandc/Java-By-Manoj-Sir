/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *
 * @author ASUS
 */
public class Duplicy {
    
    public static void main(String[] args) {
        
        
        
        
        
//        ArrayList<String> cities = new ArrayList<>();          //Duplicy is allowed in List                     [Indore, Bhopal, Ujjan, Dewas, Sehor,Indore]
        HashSet<String> cities = new HashSet<>();               // Duplicy is not allowed in Set        [Dewas, Sehor, Indore, Ujjan, Bhopal]
//        LinkedHashSet<String> cities = new LinkedHashSet<>();//Orderded Structuer me Insertion hota he        [Indore, Bhopal, Ujjan, Dewas, Sehor]
       
        
        cities.add("Indore");
        cities.add("Bhopal");
        cities.add("Ujjan");
        cities.add("Dewas");
        cities.add("Sehor");
        
        cities.add("indore");
        
        System.out.println(cities);
        
        
        
        
    }
    
}
