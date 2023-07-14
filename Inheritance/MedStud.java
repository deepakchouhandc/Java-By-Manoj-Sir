/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ASUS
 */
public class MedStud extends StudentDetails{
    
    String spec;
    int prof;
    
    /**
     *
     * @param mark
     */
    @Override
    public void Marks(int mark)
    {
        if(mark>=55)
        {
            System.out.println("Medical student is Pass......");
        }
        else
        {
            System.out.println("Medical Student is Fail........");
        }
    }
    
    public void setMedData(String spec , int prof)
    {
        this.prof=prof;
        this.spec=spec;
    }
    
    public void showMedData()
    {
        System.out.println("Specialization : "+this.spec);
        System.out.println("Prof : "+this.prof);
    }
    
    
}
