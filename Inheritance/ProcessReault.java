/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ASUS
 */
public class ProcessReault {
    
    public static void main(String[] args) {
        
        // Engineering Student object 
        System.out.println("Details of Engineering Student");
        EngStud es = new EngStud();
        es.setStudData("Deepak Chouhna", 31);
        es.setEngData("CSE", 6);
        es.showStudDate();
        es.showEngData();
        es.Marks(99);
        
        
        
        // Medical Student Object
        System.out.println("\nDetails of Medical Student");
        MedStud ms = new MedStud();
        ms.setStudData("Abishek Gurjar", 32);
        ms.setMedData("Pharmacy", 2);
        ms.showStudDate();
        ms.showMedData();
        ms.Marks(45);
        
        
        // Law Student Object
        System.out.println("\nDetails of Law Student");
        LawStud ls = new LawStud();
        ls.setStudData("Aniket Chouhan", 35);
        ls.setLawData(2);
        ls.showStudDate();
        ls.showLawData();
        ls.Marks(55);
        
        System.out.println("________________________________________________________________________");
        
         StudentDetails dd = new StudentDetails();
         dd.setStudData("DDDDDDDDD", 12345);
         String n = dd.toString();
         System.out.println(n);
        
        
        
        
        
        
        
        
        
    }
    
}
