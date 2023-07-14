/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ASUS
 */

// there are two ways to remove this error first is we make it abstract but when we meke it abstract then we can't instanciated it or can't make it's object
//second is we gave implementation of every method of parent class....
public class savingAccount implements Account{

    @Override
    public void openAccount() {
        System.out.println("process of opening a Saving Account.....");
    }

    @Override
    public void closeAccount() {
        System.out.println("Process of closing a Saving Account.....");
    }

    @Override
    public void interst() {
        System.out.println("Compute Intreset of Saving Account....");
        
    }
    
    
    
    
}
