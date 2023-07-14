/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ASUS
 */
class Parent{
    public void funtion()
    {
        System.out.println("Parent::funtion() called");
    }
}

class Child extends Parent{
    @Override
    public void funtion()
    {
        System.out.println("Child :: funtion() called");
    }
}



public class LinkedIn {
    public static void main(String[] args) {
        
        
        Child c = new Child();
        Parent pp = new Parent();
        Parent p = new Child();
        c.funtion();
        p.funtion();
        pp.funtion();
        
    }
    
}
