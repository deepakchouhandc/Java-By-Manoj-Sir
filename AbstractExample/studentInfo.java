/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractExample;

/**
 *
 * @author ASUS
 */
public abstract class studentInfo {
    private String name;
    private int roll;

    public studentInfo(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    
    public void info()
    {
        System.out.println("Name           :     "+name);
        System.out.println("Roll No.     :     "+roll);
    }
    
    public abstract void result(int mark);
    
}
