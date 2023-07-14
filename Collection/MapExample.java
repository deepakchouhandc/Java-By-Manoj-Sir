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
public class MapExample {
    
    public static void main(String[] args) {
        
//        HashMap<String,String> mis = new HashMap<>();  // It will give Unordered Way of Insertion   {HM=Shah, FM=Nirmal, PM=Modi, DC=Deepak}
//        LinkedHashMap<String,String> mis = new LinkedHashMap<>();// It will gave orderded way of insertion  {PM=Modi, HM=Shah, FM=Nirmal, DC=Deepak}
        TreeMap<String,String> mis = new TreeMap<>(); // It will gave sorted orderd  {DC=Deepak, FM=Nirmal, HM=Shah, PM=Modi}
        
        mis.put("PM", "Modi");
        mis.put("HM", "Shah");
        mis.put("FM", "Nirmal");
        mis.put("DC", "Deepak Chouhan");
        
        System.out.println(mis);
        
        
        String name = mis.get("DC");//get method gave the value coresponding to the key...
        System.out.println(name);
        
               
        
        
        
    }
    
    
}
