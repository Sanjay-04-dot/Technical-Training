package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        try {
            int sum = num2 / num1;
            System.out.println("The denominator is not zero");

            System.out.println("Enter index: max5: ");
            int i=sc.nextInt();

            int arr[]={1,2,3,4,5};
            System.out.println("Index at "+i+" is: "+arr[i]);

        }catch (ArithmeticException e) {
            System.out.println("Exception Occured: " + e);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Undefined, Exception caught: "+e);
        }

        finally {
            sc.close();
            System.out.println("Finally Block Executed");
        }
    }

    static {
        System.out.println("this is static block executed beforee main");
    }
}
