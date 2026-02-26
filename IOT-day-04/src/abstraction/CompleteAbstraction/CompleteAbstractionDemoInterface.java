package abstraction.CompleteAbstraction;

public interface CompleteAbstractionDemoInterface {
    void sound();
    void name();

}

class child1 implements CompleteAbstractionDemoInterface{
    public void sound(){
        System.out.println("Inside child1 Sound");
    }

    public void name(){
        System.out.println("Inside child1 name");
    }
}

class MainChild{
    public static void main(String[] args) {
        child1 c=new child1();

        c.name();
        c.sound();
    }
}