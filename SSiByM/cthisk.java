/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SSiByM;

/**
 *
 * @author ASUS
 */
public class cthisk {

    private int roll, mark;
    private String name;

    public cthisk(int a, int b) {
        roll = a;
        mark = b;
    }

    public cthisk(int p, String n, int q) {
        // this keyword invoked the two args constructor  
//        System.out.println("hello");
// must be call at first place
        this(q, q);
        name = n;
    }

    void show() {

        System.out.println("RollNO " + roll + "\nName " + name + "\nMark " + mark);

    }

    public static void main(String[] args) {
        cthisk ob = new cthisk(010, "DEEPAK", 98);
        cthisk ob1 = new cthisk(85, 99);
        ob.show();
        ob1.show();
    }

}
