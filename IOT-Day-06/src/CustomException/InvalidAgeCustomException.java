package CustomException;

import java.io.IOException;

public class InvalidAgeCustomException extends Exception {
    InvalidAgeCustomException(String msg){
        super(msg);
    }
}

class AgeCheck{
    static void vote(int age) throws InvalidAgeCustomException {
        if (age < 18) {
            throw new InvalidAgeCustomException("Age must be 18");
        }
        System.out.println("Your eligible");
    }


    public static void main(String[] args) {

        try{
            vote(17);
        }catch (InvalidAgeCustomException e)
        {
            System.out.println(e);
        }
    }
}