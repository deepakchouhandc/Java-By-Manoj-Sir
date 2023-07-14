/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPSassigment;
//Two private instance variables: radius (of the type double) and color (of the type String), with default value of 1.0 and "red", respectively.
//Two overloaded constructors - a default constructor with no argument, and a constructor which takes a double argument for radius.
//Two public methods: getRadius() and getArea(), which return the radius and area of this instance, respectively.
//Write the appropriate getter and setter method for instance member radius and color.
//Override the toString() method which will display radius and color of any of the invoking object.The toString() method can be called explicitly (via instanceName.toString()) just like any other method; or implicitly through println().

/**
 *
 * @author ASUS
 */
public class Circle {
    private double radius =1.0;
    private String color = "red";

    public Circle(int radius) {
        this.radius = radius;
        
    }
    public Circle(int radius,String color)
    {
        this.radius = radius;
        this.color = color;
        
    }

    public double getRadius() {
        return radius;
    }
    public String getColor()
    {
        
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    void show ()
    {
        System.out.println(" radis = "+radius+"\n color = "+color);
    }
    
    public double setArea()
            
    {
       return 3.14*radius*radius;
    }

   
    
}
