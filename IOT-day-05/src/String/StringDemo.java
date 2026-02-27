package String;

public class StringDemo {
    public static void main(String[] args) {
        String s1="Ollllllyutulllljavac++Worlgd!";
        String s2=new String("llllolllc++++World!");

        System.out.println("Origin");
        System.out.println("Using == :"+(s1==s2));
        System.out.println("" + s1.compareTo(s2));

    }
}
