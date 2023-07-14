/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOExample.OutputStram;

import java.io.FileOutputStream;

/**
 *
 * @author ASUS
 */
public class WriteMethod {
    
    public static void main(String[] args) throws Exception{
        
        // here we have to write data on the file
        
        // Open a Stream 
        //FileOutputStream fos = new FileOutputStream("D:\\text file\\Java Data\\dc.txt");//Overide 
        FileOutputStream fos = new FileOutputStream("D:\\text file\\Java Data\\got.txt",true);//append
        
        //Write the data
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(101);
        
        // Close the file
        fos.close();
        
        System.out.println("Data Successfully write");
        
        
        
    }
    
}
