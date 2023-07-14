/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author ASUS
 */
public class GenricExample<T> {
    
    
    void display(T p)
    {
        System.out.println(p);
        
    }
    
    public static void main(String[] args) {
        
        GenricExample<Integer> ob1 = new GenricExample<>();
        ob1.display(10);
        ob1.display(20);
        GenricExample<String> ob2 = new GenricExample<>();
        ob2.display("Deepak");
        GenricExample<Double> ob3 = new GenricExample<>();
        ob3.display(2.5);
        
        
        
        
    }
    
}
