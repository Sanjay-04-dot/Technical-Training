import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int a = 0, b = 1, c = 1;
        int sum = 0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        while (n < 10) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
            System.out.println(sum);
            n++;
        }

    }
}

