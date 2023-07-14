package SSiByM;

public class circlemain {
    
        public static void main(String[] args) {
        
            Circle c = new  Circle();
             //  c.radius=10; wrong due to private data type in the circle class  
          c.setRadius(10);
           c.CalculateArea();
           c.CalculateCircumference();
           //c.display();
    }
}
