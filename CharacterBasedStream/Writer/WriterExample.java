/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterBasedStream.Writer;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author ASUS
 */
public class WriterExample {
    
    public static void main(String[] args) throws Exception{
        
        FileWriter f = new FileWriter("D:\\text file\\Java Data\\get.txt",true);
        
        String msg = "some data is store in file using Writer method which is char based stream";
        
       // f.write(msg);
       f.write(msg, 8, 25);
        
        f.close();
        
        System.out.println("Successfully store");
        
        
    }
    
}
