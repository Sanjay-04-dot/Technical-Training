import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        int mod=0,num=0;



        while(n>0)
        {
            num=n%10;
            n=n/10;
            mod+= Math.sqrt(num);
            if(n==0)
                n=mod;
            if(n==1) {
                System.out.println("Happy Number");
                break;
            }
            if(n==4)
            {
                System.out.println("Not Happy Number");
                break;
            }
        }
    }
}
