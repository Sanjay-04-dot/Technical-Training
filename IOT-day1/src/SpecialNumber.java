//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SpecialNumber{
    public static void main(String[] args) {

        int n=99;
//        int first = n/10; //1
//        int last = n%10;  //9
//        int sum=first+last;
//        int product=first*last;

//        if((sum+product)==n)
          if(((n%10) + (n/10)) + ((n%10) * (n/10))==n)
            System.out.println(n+" is a Special Number");
        else
            System.out.println(n + " is not a Special number");
    }
}