package SSiByM;

import java.util.Arrays;

public class Varargs {
    
    //it is treated as array 
//    public static void add(int...v)
//    {
//        int sum = 0;
//         
//        for(int i = 0 ; i<v.length ; i++)
//        {
//            System.out.println(v[i]);
//            sum =sum+v[i];
//        }
//        System.out.println("sum through verargs "+sum);
//    }
    
    //compiler gave perfence of exact match............
   
    
    // FOR EACH LOOP 
    public static void add(int ... v)
    {
        int sum=0;
        
        for(int num:v)
        {
            //System.out.println(v[num]);
            sum = sum + num;
           
        }
        System.out.println("Sum of Integer through varargs usin for each loop is "+sum);
        
    }
    
    
     public static void add(int a,int b)
    {
        System.out.println("sum of two variable is "+(a+b));
    }
        
                                                                                                   //varargs overloading 
    public static void add(double ...d)
    {
        double sum=0;
       //using for each loop
        for(double s:d)
        {
            sum=(sum+s);
        }
        System.out.println("Sum of double through varargs using for each loop is "+sum);
    }
    
   
    
    
   public static void show(String...item)
   { 
       for(String it:item)
       {
           System.out.println(it);
       }
       System.out.println("_____________________________________________________");
   }
    

//    public static void add(int a,int b)
//    {
//        System.out.println(a+b);
//    }
//    public static void add(int a,int b,int c)
//    {
//        System.out.println(a+b+c);
//    }                                                                     // this is called method OVERLOADING it has limitation....
                                                                            //so we use VARARGS in this please................
//     public static void add(int a,int b,int c,int d)
//    {
//        System.out.println(a+b+c+d);
//    }
//    
//      public static void add(int a,int b,int c,int d,int e)
//    {
//        System.out.println(a+b+c+d+e);
//    }
    
    
    
    public static void main(String[] args) {
        add();
        add(10,20);// not calling the varargs call the exact match........
        add(10, 20,30);
        add(10, 20, 30,40);
        add(10, 20, 30, 40, 50);
        add(2.5,4.5,6.5,8.2,45.5);
        
        show("Deepak","chouhan");
        show("Manish","shah","movies");
        show("Indore","Bhopal","Ujjan","Dewas");
        show("Channie","Kolkata","Goa","Rajistan","Gujrat");
        
        
    }
    
}
