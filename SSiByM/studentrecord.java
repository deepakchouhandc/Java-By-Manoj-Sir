package SSiByM;

public class studentrecord {

    //inatance variable(non-static variable)have one for each method.
    private int rollNo;
    private String name;
    private  int marks;
                                                                                        //data members
    //class variable (static variable) have only one copy for entire class .
    private static int totalPass;
    private static int totalFall;
   
    
    //all variable are private so we can't acess them form outside of class so we can make a method to set the variable to the class from main class.
    public void setData(int roll,String Name,int M)
    {
        rollNo = roll;
        name = Name;
        marks = M;
    }
    
    //in the overallResutl method there are class (static variable)variable so we can meke it static method......
    public static void overallResult()
    {
        System.out.println("=========================================");
        System.out.println("No of Students are pass "+totalPass);
        System.out.println("No of student are Fall "+totalFall);
        System.out.println("=========================================");
    }
    
    
    //This method needs static and non static variables so we made it non static method .........
    public void display()
    {
        System.out.println("__________________________________________");
        System.out.println("Roll No.= "+rollNo);
        System.out.println("Name = "+name);
        System.out.println("Marks = "+marks);
       
         if(marks>=75)
       {
           System.out.println("Pass student ");
           totalPass++;
       }
       else
       {
           System.out.println("Fall student ");
           totalFall++;
       }
       System.out.println("___________________________________________");  

    }
    
    
    //Here showGrade is static method and from main class we are passing obeject and recived studentrecord in the variable temp............
    //here all variable are static because pass thought the object..............
    public static void showGrade(studentrecord temp)
    {
        if(temp.marks>90)
        {
            System.out.println("Grade of "+temp.rollNo+" A");
        }
        else if(temp.marks>80)
        {
            System.out.println("Grade of "+temp.rollNo+" B");
        }
        else
        {
            System.out.println("Grade of "+temp.rollNo+" C");
        }
    }
    
    
    // useing varargs in showAvg
    public static void showAvg(studentrecord...s)
    {
        int sum = 0;
        for(int i = 0 ;i<s.length;i++)
        {
            sum = s[i].marks+sum;     
        }
        System.out.println("Average of sutdent "+(sum/s.length));
    
    }
    
    
    
    
    
    
    /*  
    //here we can say that we are converting the instance variable(non-static variable)to static one thought passing obejct and reciving in the object..
    //if two objects are passed the it come here ...........
    public static void showAvg(studentrecord temp1,studentrecord temp2)
    {
        System.out.println("====================================================================================");
        System.out.println("Average marks of "+temp1.rollNo+" and "+temp2.rollNo+" is = "+((temp1.marks+temp2.marks)/2));
    }
    
    //here three objects are passed for the other class the is come here
    public static void showAvg(studentrecord t1,studentrecord t2,studentrecord t3)
    {
        System.out.println("====================================================================================");
        System.out.println("Average marks of "+t1.rollNo+" , "+t2.rollNo+" and "+t3.rollNo+" is = "+((t1.marks+t2.marks+t3.marks)/3));
    }
    
    //if four objects are passed the its come here...........
    public static void showAvg(studentrecord t1,studentrecord t2,studentrecord t3,studentrecord t4)
    {
        System.out.println("====================================================================================");
        System.out.println("Average marks of "+t1.rollNo+" , "+t2.rollNo+" , "+t3.rollNo+" and "+t4.rollNo+" is = "+((t1.marks+t2.marks+t3.marks+t4.marks)/4));
    }
    
    //if four objects are passed the it will come here............
    //can not made same method with the same argument and same numbers of data types 
//    public static void showAvg(studentrecord t1,studentrecord t2,studentrecord t3,studentrecord t4)
//    {
//        System.out.println("====================================================================================");
//        System.out.println("Average marks of "+t1.rollNo+" , "+t2.rollNo+" , "+t3.rollNo+" and "+t4.rollNo+" is = "+((t1.marks+t2.marks+t3.marks+t4.marks)/4));
//    }
    
     //if five objects are passed the it will come here............
     public static void showAvg(studentrecord t1,studentrecord t2,studentrecord t3,studentrecord t4,studentrecord t5)
    {
        System.out.println("====================================================================================");
        System.out.println("Average marks of "+t1.rollNo+" , "+t2.rollNo+" , "+t3.rollNo+" , "+t4.rollNo+" and "+t5.rollNo+ " is = "+((t1.marks+t2.marks+t3.marks+t4.marks+t5.marks)/5));
    }
*/
}
