/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class InstanYref {
    
    public static void main(String[] args) {
        
        
        //Account is abstract; cannot be instantiated
    //Account ac = new Account();
    
    
    //we can create reference of it ........
    Account ac1,ac2;
    
    ac1 = new savingAccount();
    System.out.println();
    ac2 = new currentAccount();
       
    ac1.openAccount();
    System.out.println();
    
    ac2.openAccount();
    System.out.println();
    
    ac1.show();
    System.out.println();
    
    Account.disp();
    
        
    }
    
    
}
