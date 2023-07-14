package Add;
import Inheritance.EngStud;
import java.util.Scanner;

public class Dadd extends EngStud{
    
    // no arrgument no returen type 
    void add(){
    
        Scanner sc = new Scanner(System.in);
        int num1 , num2 ,sum;
        
        System.out.println("Enter the first number");
        num1=sc.nextInt();
        
         System.out.println("Enter the second number");
        num2=sc.nextInt();
        
        sum=num1+num2;
        
        System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
        
    }
    
    
    
    public static void main(String[] args) {
        
        Dadd ob= new Dadd();
        ob.add();
    
        
    }
    
}
