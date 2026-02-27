package ExceptionHandling;

public class Example3Throw {

    static void CheckAge(int age){
        if(age>=18){
            System.out.println("eligible");
        }
        else {
            throw new RuntimeException("Not Eligible for to Vote");
        }
    }

    public static void main(String[] args) {
        Example3Throw.CheckAge(17);
    }
}
