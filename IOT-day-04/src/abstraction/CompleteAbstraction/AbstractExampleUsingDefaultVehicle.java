package abstraction.CompleteAbstraction;

public interface AbstractExampleUsingDefaultVehicle {
    void start();

    default void stop(){
        System.out.println("Vehicle has stopped");
    }

}

class Audi implements AbstractExampleUsingDefaultVehicle{
    public void start(){
        System.out.println("Audi has Started");
    }
}

class BMV implements AbstractExampleUsingDefaultVehicle{
    public void start(){
        System.out.println("BMV has Started");
    }
    public void stop(){
        System.out.println("BMV has stooped- By using 3rd Method");
    }
}

class Hero implements AbstractExampleUsingDefaultVehicle{
    public void start(){
        System.out.println("Hero has Started");
    }
}

class VehicleMain{
    public static void main(String[] args) {
        Hero h=new Hero();
        h.start();

        h.stop(); //1st way By creating the obj of child class

        AbstractExampleUsingDefaultVehicle obj1=new Audi();

        obj1.stop(); //2nd way upcasting

        BMV bmv=new BMV();
        bmv.stop(); //3rd way

    }
}