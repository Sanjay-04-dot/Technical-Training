import java.util.Scanner;
public class ZigZagPattern {
    public static void main(String[] args) {
        int i,j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
//      int n =sc.nextInt();
        int n=13;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=n;j++)
            {
                if((i==1 && j%4==3) || (i==2 && j%2==0) || (i==3 && j%4==1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
