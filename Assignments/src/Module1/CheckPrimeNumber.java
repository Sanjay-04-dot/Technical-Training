package Module1;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int i=2;
        boolean prime=true;

        for(i=2;i<num1;i++)
        {
            if(num1%2==0)
            {
                prime=false;
                break;
            }
        }

        if(prime)
            System.out.println("Prime number "+num1);
        else
            System.out.println("Not Prime: "+num1);
    }
}
