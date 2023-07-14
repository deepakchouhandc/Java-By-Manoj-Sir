/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterBasedStream;


import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 *
 * @author ASUS
 */
public class DataInputExample {
    
    public static void main(String[] args) throws Exception{
        System.out.println("start");
        //here we have to read primitive data form greek.txt 
        FileInputStream fis = new FileInputStream("D:\\text file\\Java Data\\empinfo.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println("atg");
        
        System.out.println("beint");
        int v1 = dis.readInt();
        double v2 = dis.readDouble();
        boolean v3 = dis.readBoolean();
        System.out.println("after");
        
        dis.close();
        fis.close();
        
        System.out.println("EMP NO. "+v1);
        System.out.println("Salary "+v2);
        System.err.println("Status "+v3);
        
        
    }
    
}


//        while(true)
//        {
//            int n = fis.read();
//           if(n==-1)
//               break;
//            System.out.print((char)n);
//        }
//        
//        System.out.println("");
//        
//        
//        fis.close();
                
        