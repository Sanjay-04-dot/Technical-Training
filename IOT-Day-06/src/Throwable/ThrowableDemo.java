package Throwable;

public class ThrowableDemo {
    static void function()throws Throwable{
        throw new Throwable("Something went Wrong");
    }

    public static void main(String[] args) {
        try{
            function();
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
    }
}


/*
throw new Exception("Message")
throw new RuntimeException("Message");
throw new Throwable("Message");

Not allowed: X
throw new String X
 */