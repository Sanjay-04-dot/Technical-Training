package Module2;
import java.util.Scanner;

public class FirstOneFactorialUsingRecursion {

    static long fact(long n){
        if(n==1)
            return n;
        return n *fact(n-1);
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        long n=sc.nextInt();
        System.out.println(fact(n));

    }
}
