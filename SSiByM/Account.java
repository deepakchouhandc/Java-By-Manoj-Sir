package SSiByM;

public class Account {

    //non static variable (instance variables)
    private int AccountNumber;
    private String Name;                                                //data members
    private double balance;

    //static variable(class variable)
    private static double TotalCashBank;
    private static int TotalBankAccount;

    public void Setdata(int ac, String name, double bal) {
        AccountNumber = ac;
        Name = name;
        balance = bal;
        TotalBankAccount++;
        TotalCashBank = (TotalCashBank + balance);
    }

//   public void BankInfo()
//   {
//       TotalCashBank= TotalCashBank + balance;
//       
//      /* if(AccountNumber!=0)
//       {
//           TotalBankAccount++;
//       } */     
//   }
    public void BankManger() {
        System.out.println("=====================================================");
        System.out.println("Account Holder Details");
        System.out.println("_____________________________________________________");
        System.out.println("Account Number :-  " + AccountNumber);
        System.out.println("Account Holder Name :-  " + Name);
        System.out.println("Account Balance :-  " + balance);
        System.out.println("=====================================================");
    }

    public void insideInfo() {
        System.out.println("*****************************************************");
        System.out.println("Total Cash available in the Bank = " + TotalCashBank);

        // System.out.println("Total Cash available in the Bank = "+(TotalCashBank=(TotalCashBank+balance)));
        System.out.println("Total numbers of Bank Account in the Bank  = " + TotalBankAccount);

    }

}
