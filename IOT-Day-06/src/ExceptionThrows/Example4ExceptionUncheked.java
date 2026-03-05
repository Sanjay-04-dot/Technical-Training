package ExceptionThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4ExceptionUncheked {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = null;

        try{
            br=new BufferedReader(new InputStreamReader(System.in));
            str=br.readLine();

            System.out.println("You have Entered: "+str);

        } catch (IOException e) {
            System.out.println(e);
        }
        finally {
            br.close();
        }
    }
}
