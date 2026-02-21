package Polymorphism;

public class OverRidiningCar {
    void model(){
        System.out.println("car");
    }
}

class Formula1 extends OverRidiningCar{
    @Override
    void model()
    {
        System.out.println("Formula1 car, Red Bull");
    }
}

class Cars{
    public static void main(String [] args)
    {
        OverRidiningCar f = new Formula1();
        OverRidiningCar f1=new OverRidiningCar();
        f.model();
        f1.model();
    }
}
