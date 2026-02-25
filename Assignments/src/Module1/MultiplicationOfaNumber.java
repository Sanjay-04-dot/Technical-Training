package Module1;

import java.util.Scanner;

public class MultiplicationOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num1+" x "+i+" = "+(num1*i));
        }
    }
}
