package SSiByM;

public class Constructore {

    private int x, y;

    public void setData(int a, int b) {
        x = a;
        y = b;
    }

    public void show() {
        System.out.println(x + "," + y);

    }

    public Constructore() {
        System.out.println("ZERO constructor called");
    }//constructor with 0 args 

    public Constructore(int a) {
        System.out.println("one args const. called " + a);

    }

    public Constructore(int a, int b) {
        System.out.println("two args const. called " + a + " and " + b);
    }

    public Constructore(String s) {
        System.out.println("String const. is called " + s);
    }

    public static void main(String[] args) {

        //which one is called depend on the arug. passed .............
        Constructore c1 = new Constructore();  // default constructor are called with zero arg..........
        Constructore c2 = new Constructore(10);
        Constructore c3 = new Constructore(12, 23);
        Constructore c4 = new Constructore("Deepak");

        //use of constructure for initization purpose...........
        Constructore t1 = new Constructore();
        Constructore t2 = new Constructore();
        t1.setData(10, 20);
        t2.setData(30, 40);
        t1.show();
        t2.show();

    }

}
