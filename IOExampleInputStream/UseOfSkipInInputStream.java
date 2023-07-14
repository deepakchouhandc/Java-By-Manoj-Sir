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
public class UseOfSkipInInputStream {
    
    public static void main(String[] args) throws Exception{
        
        FileInputStream fis = new FileInputStream("D:\\text file\\Java Data\\dc.txt");
        
        System.out.println((char)fis.read());  //A
        System.out.println((char)fis.read());  //B
        System.out.println((char)fis.read());  //C
        fis.skip(3); // it will skip 3  char DEF
        System.out.println((char)fis.read());//G
        System.out.println((char)fis.read());//H
        fis.skip(4);
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
        fis.skip(3);
        
    }
    
}
