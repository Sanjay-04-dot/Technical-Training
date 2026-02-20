import java.util.Scanner;

public class normalSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a Character: ");
        char ch= sc.next().charAt(0);
        ch=Character.toUpperCase(ch);
        String color=" ";
        switch(ch)
        {
            case 'V':
                color="Violet";
                break;
            case 'I':
                color="Indigo";
                break;
            case 'B':
                color="Blue";
                break;
            case 'G':
                color="Green";
                break;
            case 'Y':
                color="Yellow";
                break;
            case 'O':
                color="Orange";
                break;
            case 'R':
                color="Red";
                break;
            default:
                System.out.println("Not a Rainbow Color");

        }
        System.out.println(" "+color);

    }
}
