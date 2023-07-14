/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractExample;

/**
 *
 * @author ASUS
 */
public class MedStud extends studentInfo{
    private String specilization;
    private int prof;

    public MedStud(String name, int roll) {
        super(name, roll);
    }

    public void setMedData(String s,int p)
    {
        this.specilization=s;
        this.prof=p;
    }
      
     public void MedInfo()
    {
        System.out.println("Specilization      :   "+specilization);
        System.out.println("Proferss    :  "+prof);
    }
    

    @Override
    public void result(int mark) {
        if(mark>55)
        {
            System.out.println("MedStud is passed....");
        }
        else
        {
            System.out.println("MedStud is fail....");
        }
    }
    
    
}
