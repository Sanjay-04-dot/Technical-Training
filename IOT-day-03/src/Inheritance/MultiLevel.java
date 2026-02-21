package Inheritance;

public class MultiLevel {
    void displayparent()
    {
        System.out.println("hello i am parent");
    }
}

class son extends MultiLevel {
    void displayson() {
        System.out.println("hello  i am son");
    }
}

class grandson extends son {
    void displaygrandson() {
        System.out.println("This is grand son");
    }
}


class multilevelinheritance{
    public static void main(String[] args)
    {
        grandson obj=new grandson();
        System.out.println("displaying the methods from grandson class");
        obj.displayparent();
        obj.displayson();
        obj.displaygrandson();

        System.out.println();


        son obj2= new son();
        System.out.println("displaying the methods from son class");
        obj2.displayparent();
        obj2.displayson();

        System.out.println();

        MultiLevel obj3=new MultiLevel();
        System.out.println("displaying the methods from parent class");
        obj3.displayparent();

        System.out.println();
    }

}




