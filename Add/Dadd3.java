package Add;
import java.util.Scanner;

public class Dadd3 {
 
    int add(int x,int y){
        
        int sum=x+y;
        
        return sum;    
    }
       
    public static void main(String[] args) {
        
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        a=sc.nextInt();
        
        System.out.println("Enter the number");
        b=sc.nextInt();
        
        Dadd3 ob =new Dadd3();
        int result=ob.add(a, b);
        
        System.err.println("The sum of "+result);
        
        
    }
    
}
