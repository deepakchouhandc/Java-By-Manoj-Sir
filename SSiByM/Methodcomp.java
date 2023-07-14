package SSiByM;

/**
 *
 * @author DC
 */
public class Methodcomp {
    private int x , y;
    
    public boolean eaquals(Methodcomp temp)
    {
        if(x==temp.x && y==temp.y)
            return true;
        else
            return false;
        
    }

    public Methodcomp(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public static void main(String[] args) {
        Methodcomp t1 = new Methodcomp(10, 20);
        Methodcomp t2 = new Methodcomp(10, 20);
        Methodcomp t3 = t1;
        
        boolean res1=(t1==t2);
        System.out.println(res1);
        
        boolean res2 = t1.eaquals(t3 );
        System.out.println(res2);
    }
    
}
