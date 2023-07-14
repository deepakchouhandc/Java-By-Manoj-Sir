/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOExampleInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 * D:\text file\Java Data\
 */
public class InputStreamReadingAFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name with Path ");
        String file = sc.nextLine();
        System.out.println(file);
        FileInputStream fis = new FileInputStream(file);
        
        while (true) { 
            
            int n = fis.read();
            if(n==-1)break;
           System.out.print((char)n);
        }
        System.out.println("");
        
        
        
        fis.close();
        
    }
}
