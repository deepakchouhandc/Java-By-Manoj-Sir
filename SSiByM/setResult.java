package SSiByM;

public class setResult {

    public static void main(String[] args) {
       studentrecord s1 = new  studentrecord();
       studentrecord s2 = new  studentrecord();
       studentrecord s3 = new  studentrecord();
       studentrecord s4 = new  studentrecord();
       studentrecord s5 = new  studentrecord();
       studentrecord f = new studentrecord();
       
       //Set the data to the private members of the studentrecords throught setdata method which is present in the same class. 
       s1.setData(101, "Deepak Chouhan", 95);
       s2.setData(102,"Mahesh Babu", 85);
       s3.setData(103, "Allu Arjun", 75);
       s4.setData(104,"Yash", 68);
       s5.setData(105, "Smarnatha", 56);
       
       //display the data of the studentrecords thought display method.
       s1.display();
       s2.display();
       s3.display();
       s4.display();
       s5.display();
       
       //static method overallResult so we can call it directly ...
       studentrecord.overallResult();
       
       //Static method is called thought studentrecord.showGrade passing obeject of particular incentance .....
       studentrecord.showGrade(s1);
       studentrecord.showGrade(s3);
       studentrecord.showGrade(s2);
       
       studentrecord.showAvg(s1, s2);
       studentrecord.showAvg(s2, s3);
       studentrecord.showAvg(s1, s3);
       
       //method overloading --- above we passing two paramiter and below we passing three parameter of same method 
       //having multiple method with same name and DIFFERENT ARGUMENT and PARAMETER(diff in types and numbers)
       
       studentrecord.showAvg(s1, s2, s3);
       
       //with four parameters
       studentrecord.showAvg(s1, s2, s3, s4);
       
       //with five parameters
       studentrecord.showAvg(s1, s2, s3, s4, s5);
    }
}
