package Add;
import java.util.Scanner;

public class Dadd1 {
    void add(int x,int y){
       
        int sum;
        
        sum=x+y;
        
        System.out.println("Sum is "+sum);
        
      
    }
   
    
    public static void main(String[] args) {
       
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        a=sc.nextInt();
        
        System.out.println("Enter the number");
        b=sc.nextInt();
        
         Dadd1 ob=new Dadd1();
         ob.add(a, b);
        
    }
    
}
