package projecttest;

public class BankingSystem {
    long accountNumber;
    double balance;

    static{
        String BankName="State Bank of India";
    }

    {
        System.out.println("Account instance initializing");
    }

    BankingSystem(long accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    void withdraw(double amount)
    {
    }
}

class SavingsAccount extends BankingSystem{
    int interestRate;

    SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void withdraw(double amount){
        if(balance<1000)
        {
            System.out.println("you cant withdraw\n your balance is less than 1000");
        }
        else{
            System.out.println("withdrawn : "+amount);
        }
    }
}

class Account{
    public static void main(String [] args)
    {
        BankingSystem bank = new SavingsAccount(9862500100563201L,2500);
        bank.withdraw(1500);

    }
}


