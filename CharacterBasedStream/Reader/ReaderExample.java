/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterBasedStream.Reader;

import java.io.FileReader;

/**
 *
 * @author ASUS
 */
public class ReaderExample {
    
    public static void main(String[] args) throws Exception{
        
        FileReader f = new FileReader("D:\\text file\\Java Data\\got.txt");
        char ch[] = new char[15];
        f.read(ch);
        
        
        for(char c : ch)
        {
            System.out.print(c);
        }
        System.out.println("");
        
        f.close();
        
    }
    
}
