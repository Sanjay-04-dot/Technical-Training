import java.util.*;

public class KaprekarsNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a=true;

        while (a) {
            int square = 0, div = 1, mod = 0, divi = 0;
            System.out.print("Enter the num: ");
            int n = sc.nextInt();
            square = n * n;
            while (divi >= 0) {

                if (n == 1) {
                    System.out.println("kapricon Number");
                    break;
                }
                mod = square % div;
                divi = square / div;

                if ((mod + divi) == n | divi <= 0)
                    break;
                div = div * 10;
            }

            if ((mod + divi) == n | n==1) {
                System.out.println("Kapricus number");
            } else {
                System.out.println("not a kapricus number");
            }

        }
    }
}
