/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterBasedStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author ASUS
 */
public class CopyImg {
    
    public static void main(String[] args) throws Exception{
        
        // here we will copy a contain of an image to anothe one
        
        //opering a stream to read the image contain C:\Users\ASUS\OneDrive\Pictures\Project copy form here ...
        
        FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Pictures\\DC\\img.jpg");
        
        int n = fis.available(); // to know the total no. of elements in the array
        byte b[] = new byte[n];  // creating byte array
        fis.read(b);             // reading data form stream and stored in the bytes array
        fis.close();             // closing the stream
        
        
        //opening a strem to write the image contain    C:\Users\ASUS\OneDrive\Pictures\Saved Pictures  and past here...
        
        FileOutputStream fos = new FileOutputStream("C:\\Users\\ASUS\\OneDrive\\Pictures\\Saved Pictures\\dc.jpg");
        fos.write(b);
        fos.close();
        
        System.out.println("Data Copy Successfully");
    }
    
}
