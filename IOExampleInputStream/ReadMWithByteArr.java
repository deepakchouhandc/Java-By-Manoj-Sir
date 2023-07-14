/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOExampleInputStream;

import java.io.FileInputStream;

/**
 *
 * @author ASUS
 */
public class ReadMWithByteArr {
    
    public static void main(String[] args) throws Exception {
        
        // here we will open a file 
        FileInputStream fis = new FileInputStream("D:\\text file\\Java Data\\got.txt");
        
        // it will gave the total elements present in the file.
        int  n= fis.available();
        // now make byte array
       
        byte b[] = new byte[n];
        
        fis.read(b);
        
        String s = new String(b);
        
        System.out.println(s);
        
        fis.close();
        
        
    }
    
}
