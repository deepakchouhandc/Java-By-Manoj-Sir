/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author ASUS
 */
public class Emp {
    
    private int eno;
    private String name;
    private int sal;
    private String designatio;

    public Emp(int eno, String name, int sal, String designatio) {
        this.eno = eno;
        this.name = name;
        this.sal = sal;
        this.designatio = designatio;
    }

    @Override
    public String toString() {
        return "Emp{" + "eno=" + eno + ", name=" + name + ", sal=" + sal + ", designatio=" + designatio + '}';
    }


    
    
    
    
    
}
