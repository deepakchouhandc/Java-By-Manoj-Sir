/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ASUS
 */
class person{
    //we can make the data member private in the point of data abstraction.... 
     private String name;
     private String address;

    public person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //to display the information of person class....
    public void info()
    {
        System.out.println("\n***** DC Group and Industries *****\n");
        System.out.println("Name          :  "+name);
        System.out.println("Address       :  "+address);
    }
    
}

class employee extends person{
    private String desg;
    private int salary;
    
    public employee(String name,String address,String desg,int salary)
    {
        super(name,address);
        this.desg = desg;
        this.salary = salary;
    }
    
    @Override
    public void info()
    {
        super.info();
        
        System.out.println("Designation   :  "+desg);
        System.out.println("Salary        :  "+salary);
                
    }
    
    
    
    
}


public class exampleSuper {
    public static void main(String[] args) {
        
        employee em = new  employee("Deepak", "Indore", "CEO & Founder", 100000000);
        em.info();
        
        System.out.println("____________________________________________________________________");
        
        employee em2 = new employee("AAA", "Mumbai", "Manager", 500000);
        em2.info();
        
        System.out.println("____________________________________________________________________");

        employee em3 = new employee("DDD", "Pune", "HR", 250000);
        em3.info();
    }
    
}
