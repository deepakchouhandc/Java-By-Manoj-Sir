/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SSiByM;
//private ko with in a class 
//protected ko with in the package
//public ko globle 

/**
 *
 * @author ASUS
 */
public class Task {

    private int x, y;

    public Task(int a, int b) {
        x = a;
        y = b;
    }

//    Constructore ka varage form...
    public Task(int... a) {
        System.out.println("-----------------------------------------------------");

        for (int it : a) {
            System.out.println(it);
        }
        System.out.println("-----------------------------------------------------");
    }

    void show() {
        System.out.println(x + " and " + y);
    }

    public static void main(String[] args) {
        Task t = new Task(20, 30);
        Task t3=t;
        t.show();
        Task t1 = new Task(10, 20, 30, 40);
        t3.show();
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        t.show();
        t3=new Task(50, 60);
        t3.show();

    }
}
