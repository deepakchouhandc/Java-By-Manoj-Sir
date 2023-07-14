/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ASUS
 */
public class CollectionsClass {
    
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Indore");
        cities.add("Bhopal");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        
        System.out.println(cities);
        
        Collections.sort(cities);
        System.out.println(cities);
        
        
       int index = Collections.binarySearch(cities, "Delhi");
        System.out.println(index);
        
        
    }
    
    
    
}
