 package SSiByM;
//blueprint of circle 
public class Circle {

    //data members(declear the properties of circle)
    private double radius,area,circumfrence;
    
    //providing a method to access the radius from the other class.
    //here r comes from other and store in r and r assingered to the radius 
    
    public void setRadius(double r)
    {
        radius=r;
    }
    
   //member function (methods) operation to be performe
   public void CalculateArea()
    {
        area=3.14*radius*radius;
        System.out.println("Area of circle is "+area);
    }
   
   public void CalculateCircumference()
   {
       circumfrence=2*3.14*radius;
       System.out.println("Circumfernce of circle "+circumfrence);
   }
   
   public void display()
   {
       System.out.println("Area of circle is "+area);
       System.out.println("Circumfernce of circle "+circumfrence);

   }
    
}
