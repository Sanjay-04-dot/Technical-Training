package Polymorphism;

public class OverLoading {
    int add(int a,int b)
    {
        System.out.println("Add Integer: ");
        return a+b;
    }

    double add(double a, double b)
    {
        System.out.println("Add Double");
        return a+b;
    }

    float add(float a, float b)
    {
        System.out.println("Add Float");
        return a+b;
    }

    public static void main(String []args)
    {
        OverLoading overload = new OverLoading();

        System.out.println(overload.add(5,6));
        System.out.println(overload.add(5.5f,6.5f));
        System.out.println(overload.add(4.5d,6.5d));
        System.out.println(overload.add(5.5,6.5));
    }

}
