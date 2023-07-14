/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SSiByM;


public class test {
    
    private int x,y;
    public test(int a ,int b)
    {
        x=a;
        y=b;
    }
    public void showdata(int a ,int b)
    {
       x=a;
       y=b;
    }
    public void show()
    {
        System.out.println(x+" , "+y);
    }
    
    
    // constructor
//    public test()
//    {
//        System.out.println("constructor with zero arge");
//    }
//    public test(int a)
//    {
//        System.out.println("constructor with one arge "+a);
//    }
//    public test(int a ,int b)
//    {
//        System.out.println("constructor with two arge "+b);
//    }
//    public test(String s)
//    {
//        System.out.println("constructor with String arge "+s); 
//    }
    
    public static void main(String[] args) {
//        test ob1 = new test();
//        test ob2 = new test(10);
//        test ob3 = new test(10,20);
//        test ob4 = new test("deepak");
//   Constructor is called only one time 
          test t1 = new test(65,64);
          test t2 = new test(77, 88);
          t1.show();
          // method can any number of time 
          t1.showdata(10, 20);
          t1.show();
          t1.showdata(45, 66);
          t1.show();
          t2.show();
    }
    
}
