import java.util.*;
public class ArmStrongNumbers {
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the num: ");
        int n=sc.nextInt();
        sc.close();
        int original=n;
        int count=0;
        int sum=0,d=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        n=original;

        while(n>0)
        {
            d=n%10;
            sum+=Math.pow(d,count);
            n=n/10;
        }

        if (sum==original)
        {
            System.out.println("ArmStrong Number");
        }
        else{
            System.out.println("Not a armstong number");
        }
    }
}
