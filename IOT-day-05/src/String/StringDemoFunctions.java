package String;

public class StringDemoFunctions {
    public static void main(String[] args) {

        String s1="Hello World!";
        String s2="Java Programming";

        //length()
        System.out.println(s1.length()+"\n"+s2.length());

        //chatAt
        System.out.println("Char at 3: "+s1.charAt(2));

        //toUppercase
        System.out.println("To upperCase "+s1.toUpperCase());

        //toLowercase
        System.out.println("To LowerCase: "+s1.toLowerCase());

        //equalsto
        System.out.println(s1.equals(s2));

        //Substring
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5,10));

        //contains
        System.out.println("s1.contains: "+s1.contains("Hello"));

        //IndexOF
        System.out.println("IndeOf: "+s1.indexOf('W'));

        //Replace
        System.out.println("Replace of: "+s1.replace("Hello","Hai"));

        //StartsWith and ends With
        System.out.println(s1.startsWith("Hello")+": S1 starts with Hello\n"+s1.endsWith("World!"));

        //trim- removes the whitespaces
        String s3="S A N J A Y";
        System.out.println("Removing WHitespaces: "+s3.trim());

        //concat
        System.out.println("Concat is: "+s1.concat(s2));
        s1=s1.concat("Hello World2");
        System.out.println(s1);

        //IsEmpty()
        System.out.println("IsEmpty(): "+s1.isEmpty());

        //Split()
        String str1="hello My name is Sanjay G";
        String []arr=str1.split(" ");

        for (String st: arr)
            System.out.println(st);
    }
}
