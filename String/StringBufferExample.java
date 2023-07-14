/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author ASUS
 */
public class StringBufferExample {
    
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Deepak");
        System.out.println(sb);
        
        sb.reverse();
        //sb.setLength(10);
        //sb.delete(1, 5);
        //sb.deleteCharAt(3);
        //sb.setCharAt(3,'P');
        //sb.replace(2, 4, "DC");
        //sb.insert(0, " Chouhan "); 
      //sb.append(" Chouhan");
      
        System.out.println(sb);
        
        
    }
    
}


/*

append => Add the content at the end of the exiting contents.
insert => can add the content on the desired position.
replace => can chage a range of chars with new contents.
setCharAt => can replace a single char.
deleteCharAt => can delete a char from given index.
delete => can delete a range of chars.



*/
