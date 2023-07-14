/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author ASUS
 */
public class SortedUnsortedCollection {
    
    public static void main(String[] args) {
        
//         LinkedHashSet<String> cities = new LinkedHashSet<>();  //UnSorted collection  me Store hote he      [Indore, Bhopal, Ujjan, Dewas, Sehor]
           TreeSet<String> cities = new TreeSet<>();             //Sorted collection  me Store hote he       [Bhopal, Dewas, Indore, Sehor, Ujjan]


        cities.add("Indore");
        cities.add("Bhopal");
        cities.add("Ujjan");
        cities.add("Dewas");
        cities.add("Sehor");
        
        System.out.println(cities);
        
        
    }
    
}
