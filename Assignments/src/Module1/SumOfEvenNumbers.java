package Module1;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

//        if(num1%2==1)
//            num1-=1;
        int i=0,sum=0;
        while(num1>=i)
        {
            if(i%2==0)
            {
                sum+=i;
            }
            i++;

        }
        System.out.println(""+sum);

    }
}
