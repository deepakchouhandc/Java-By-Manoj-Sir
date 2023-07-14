/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOExample.OutputStram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PlayGame {
    
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        
        //Take the User Chosie 
        System.out.println("Enter the choise : \nNew\nOld");
        String s = sc.next();
        
        //Create a refernce(not object)of the Game Class
        Game g = null;
        
        if(s.equalsIgnoreCase("New"))
        {
            g = new Game();
        }
        else if(s.equalsIgnoreCase("Old"))
        {
            // read-Game-object-from-file
            
            FileInputStream fis = new FileInputStream("D:\\text file\\Java Data\\olddata.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            g = (Game) ois.readObject();
            
            ois.close();
            fis.close();
            
        }
        
        //Take the move form the User 
        System.out.println("Enter the Horizontal Move");
        int h = sc.nextInt();
        System.out.println("Enter the Vertical Move");
        int v = sc.nextInt();
        
        //create a object of game class 
//        Game g = new Game();
        //call move method in game class 
        g.move(v, h);
        //call showPos in the game class
        g.showPos();
        
        System.out.println("Saving Game.......");
        //here we are writing a game objet to the file
        FileOutputStream fos = new FileOutputStream("D:\\text file\\Java Data\\olddata.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(g);
       
        oos.close();
        fos.close();
       
        
        System.out.println("Game end..........");
        
        
        
    }
    
}
