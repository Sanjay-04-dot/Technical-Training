package ExceptionThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4TryWithResource {
    public static void main(String[] args)throws IOException {
        String str;

        //try(..) it will automatically closes the resources and no need of finally block
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            str=br.readLine();

            System.out.println("You Entered: "+str);
        }
    }
}
