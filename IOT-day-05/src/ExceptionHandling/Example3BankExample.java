package ExceptionHandling;

public class Example3BankExample {
    public static void main(String[] args) {
        try {
            int balance=3000;
            int withdraw=20000;

            if(balance<withdraw){
                throw new ArithmeticException("Balance Not available: ");
            }
            System.out.println("Withdraw Successfullay");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
