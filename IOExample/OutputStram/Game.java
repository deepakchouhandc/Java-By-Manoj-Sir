/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOExample.OutputStram;

/**
 *
 * @author ASUS
 */
public class Game implements java.io.Serializable{
    
    private int xPos;
    private transient int yPos;//don't want to save as a object in the file this member
    
    public void move(int v,int h)
    {
        xPos = xPos+h;
        yPos = yPos+v;
    }
    
    public void showPos()
    {
        System.out.println("Current Position "+xPos+" "+yPos);
    }
      
    
    
}
