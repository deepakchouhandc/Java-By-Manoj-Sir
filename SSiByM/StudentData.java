package SSiByM;

public class StudentData {

    public static void main(String[] args) {
        CollageStudent s = new CollageStudent();

        s.setRollno(101);
        s.setName("Deepak");
        s.setyear(3);
        s.setSubject("Compute Scienc");
        s.setphoneNo(975259573);
        
        System.out.println(" Roll no = "+s.getRollno()+"\n Name "+s.getName()+"\n Year "+s.getyear()+"\n Course "+s.getString()+"\n PhoneNo. "+s.getphoneNo());
      

    }
}
