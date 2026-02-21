package AccessModifiers.package1;
import AccessModifiers.package2.*;


public class Student extends person{
    public void displayDetails(){
        System.out.println("Public: "+name);
        System.out.println("Protected: "+age);
        showAge();
    }

    public static void main(String []args)
    {
        Student s = new Student();
        person p = new person();
        s.displayDetails();
        System.out.println(p.name);

        System.out.println(10 + 20 + "30");
    }
}
