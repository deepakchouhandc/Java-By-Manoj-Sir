package SSiByM;

public class AccountData {

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();
        Account a4 = new Account();
        Account a5 = new Account();

        a1.Setdata(123, "Deepak Chouhan", 1000000);
        a2.Setdata(147, "Mallu Kathera", 564822);
        a3.Setdata(569, "Kushiya lal", 812366);
        a4.Setdata(896, "Vabhab sukhala", 456321);
        a5.Setdata(456, "Vartika Shivastab", 95872);

        a1.BankManger();
        a2.BankManger();
        a3.BankManger();
        a4.BankManger();
        a5.BankManger();

        a1.insideInfo();

    }

}
