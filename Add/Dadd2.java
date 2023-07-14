package Add;
import java.util.Scanner;


public class Dadd2 {

    int add(){
        
        int a,b,sum;
        Scanner sc=new Scanner(System.in);
         
        System.err.println("Enter the number");
        a=sc.nextInt();
        
        System.err.println("Enter the number");
        b=sc.nextInt();
        
        sum=a+b;
        
        return sum;      
                
   }

    public static void main(String[] args) {
        
        Dadd2 ob =new Dadd2();
        int rsum= ob.add();
        
        System.err.println("sum is "+rsum);
        
    }
    
}
