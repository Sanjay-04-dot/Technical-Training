import java.util.Scanner;
public class StrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number ");
        int n= sc.nextInt();
        int m=0,sum=0;
        int original =n;
        while(n>0)
        {
            int fact=1;
            m=n%10;
            for (int i = 1; i <=m; i++)
            {
                fact*=i; //fact=fact*i;
            }
            sum+=fact;
            n=n/10;
        }
//        System.out.println(sum);
        if(sum==original)
            System.out.println("Strong Number");
        else
            System.out.println("weak number");
    }
}
