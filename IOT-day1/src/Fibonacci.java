import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a =0;
        int n=0,m=1;
        int f=0;
        System.out.println(n);
        System.out.println(m);

        while(a<15)
        {
            f=n+m;
            n=m;
            m=f;
            System.out.println(f);
            a++;
        }
    }
}
