package ExceptionThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannervsBufferedReaderExample {
    public static void main(String[] args) throws IOException {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        System.out.println(str);

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        System.out.println(str);

        int num=Integer.parseInt(str);

    }


}
