public class IIB {
    int runs;
    String names;

    {
        System.out.println("Inside IIB");
    }

    static{
        System.out.println("Static block");
    }

    IIB(){
        System.out.println("Inside constructor");
    }
    void display()
    {
        System.out.println("Runs: " +(runs=120)+"\nName: "+(names="Sanjay G"));
    }

    public static void main(String[] args)
    {
        IIB ob=new IIB();
        ob.display();

    }
}
