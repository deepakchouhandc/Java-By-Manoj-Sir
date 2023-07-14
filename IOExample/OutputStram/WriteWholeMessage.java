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
public class WriteWholeMessage  {
    
    public static void main(String[] args)throws Exception{
        
        FileOutputStream fos = new FileOutputStream("D:\\text file\\Java Data\\got.txt",true);

        String msg = "Hello this call form TCS for joining the company in Indore ";
        
        //byte b[] = msg.getBytes();
        byte[] b = msg.getBytes();
        
       // fos.write(b);
       
       fos.write(b, 5, 15);
        
        fos.close();
        
        System.out.println("Messege successfully Sent ");
        
    }
    
    
}
