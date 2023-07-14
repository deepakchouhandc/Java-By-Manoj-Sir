/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author ASUS
 */
public interface Account {
    
    //non concrete method...
    public void openAccount();
    public void closeAccount();
    //by Default public he....
    void interst();
    
    //concrete method...
    public static void disp()
    {
        System.out.println("Concrete method in interface by using  static keyword before returen type");
        System.out.println("display method in the interface to diapley something to the acconut holder ");
    }
    
    default void show()
    {
        System.out.println("Concrete method in interface by using  default keyword before returen type");
        System.out.println("something for show to the user ");
    }
    
}
