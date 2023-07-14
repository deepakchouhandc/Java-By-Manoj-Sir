/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOExampleInputStream;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class FileExample2 {
    
    public static void main(String[] args) throws IOException {
        
        
        File f = new File("D:\\text file\\Java Data\\myNewFile");
        
        boolean folder = f.createNewFile();
        
        
        
//        File f1 = new File("D:\\text file\\Java Data\\dccc.txt");
//        File f2 = new File("D:\\text file\\Java Data\\dc.txt");
         
         
//        boolean folder = f.mkdir();
//        boolean folder = f.delete();
//        boolean folder = f1.renameTo(f2);

        if(folder)
        {
            System.out.println("Opration successfully....");
        }
        else
        {
            System.out.println("Operation Fail...!");
        }
        
        
        
    }
    
    
    
}
