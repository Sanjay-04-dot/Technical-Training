package ExceptionHandling;

public class Example2ExceptionHandling {
    public static void main(String[] args) {
        int num1=10;
        int num2=2;

        try{
            int k=num1/num2;
            int []arr={1,2,3,4,5};
            System.out.println(arr[10]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Caught: "+e);
        }
    }
}
