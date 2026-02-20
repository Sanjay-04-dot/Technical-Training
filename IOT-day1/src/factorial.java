import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n= sc.nextInt();
        int m=n;
        int sum=1;
        while(n>0)
        {
            sum*=m;
            m--;
            n--;
        }
        System.out.println(sum);

    }
}
