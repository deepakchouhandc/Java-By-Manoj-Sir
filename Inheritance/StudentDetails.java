/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ASUS
 */
public class StudentDetails {

    String name;
    int rollNo;

    @Override
    public String toString() {
        return "StudentDetails{" + "name=" + name + ", rollNo=" + rollNo + '}';
    }
    
    
    
    

    public void setStudData(String name, int rollNo) {
        //this name means  calling object ka name  see the color you understand 
        this.name = name;
        this.rollNo = rollNo;
    }
    
    public void Marks(int mark)
    {
        if(mark>=33)
        {
            System.out.println("Student is pass .........");
        }
        else
        {
            System.out.println("Student is Fail...........");
        }
    }

    public void showStudDate() {
        System.out.println("Name : " + this.name);
        System.out.println("Roll No. : " + this.rollNo);
    }

}
