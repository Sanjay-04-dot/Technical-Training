package ExceptionThrows;

import java.io.IOException;

public class ExampleThorwsException {

    static void read() throws IOException {
        throw new IOException("File Not Found");
    }

    static void display() throws IOException{
        read();
    }

    static void show() throws IOException{
        display();
    }

    public static void main(String[] args) {
        try{
            show();
        }catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
