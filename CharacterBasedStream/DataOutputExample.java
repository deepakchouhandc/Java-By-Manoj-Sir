/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterBasedStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author ASUS
 */
public class DataOutputExample {
    
    public static void main(String[] args) throws Exception{
        
        int eno = 10001;
        double salary = 560000.00;
        boolean status = false;
        
        FileOutputStream fos = new FileOutputStream("D:\\text file\\Java Data\\empinfo.txt");
        DataOutputStream dos = new DataOutputStream(fos);
         
        dos.write(eno);
        dos.writeDouble(salary);
        dos.writeBoolean(status);
        
        dos.close();
        fos.close();
        
        System.out.println("Successfully update on file");
        
        
        
    }
    
}
