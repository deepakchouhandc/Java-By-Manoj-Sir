/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ASUS
 */
public class LawStud extends StudentDetails{
    int year;

    public void setLawData(int year) {
        this.year = year;
    }

    public void showLawData() {
        
        System.out.println("Year : "+this.year);
    }
    
    
    
    
          
    
}
