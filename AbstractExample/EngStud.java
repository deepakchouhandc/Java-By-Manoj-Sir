/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractExample;

/**
 *
 * @author ASUS
 */
public class EngStud extends studentInfo{
    
    private String branch;
    private int sem;

    public EngStud(String name, int roll) {
        super(name, roll);
    }

 
    public void setEngData(int sem,String branch) {
        this.sem = sem;
        this.branch = branch;
    }
    
    public void EngInfo()
    {
        System.out.println("Branch      :   "+branch);
        System.out.println("Semister     :  "+sem);
    }

    @Override
    public void result(int mark) {
        if(mark>40)
        {
            System.out.println("EngStud is passed....");
        }
        else
        {
            System.out.println("EngStud is fail....");
        }
    }
    
    
}
