/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ASUS
 */
public class EngStud extends StudentDetails{
    String branch;
    int sem;
    
    public void setEngData(String branch, int sem)
    {
        this.branch=branch;
        this.sem= sem;
    }
    
    public void showEngData()
    {
        System.out.println("Branch : "+branch);
        System.out.println("Semister : "+sem);
    }
    
}
