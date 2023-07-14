/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class currentAccount implements Account{
    
     @Override
    public void openAccount() {
        System.out.println("process of opening a Current Account.....");
    }

    @Override
    public void closeAccount() {
        System.out.println("Process of closing a Current Account.....");
    }

    @Override
    public void interst() {
        System.out.println("Process to compute Intreset of Current Account....");
        
    }
    
}
