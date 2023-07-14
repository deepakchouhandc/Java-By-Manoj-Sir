/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandeling;

/**
 *
 * @author ASUS
 */
public class ExceptionHandelingExample {
    
    public static void main(String[] args) {
        System.out.println("Start of main ===================");
        int x = 0 ,y = 0,z = 0;
        
        try {
            x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        
        z = x/y;
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
  
        
        
        System.out.println("Result "+z);
        
        System.out.println("End of main ===================");
        
        
    }
    
}
