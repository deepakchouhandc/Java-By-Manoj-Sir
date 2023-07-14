/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPSassigment;

/**
 *
 * @author ASUS
 */
public class TestCircle {
    
    public static void main(String[] args) {
        Circle c = new Circle(5,"blue");
        Circle c1 = new Circle(2);
       
        c.show();
        System.out.println("Area of circle : "+ c.setArea());
        System.out.println("_____________________________________");
        c1.show();
        System.out.println("Area of circle : "+  c1.setArea());
    }
    
}
