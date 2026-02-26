package abstraction;
abstract class AbstractionDemoAnimal {
    abstract void sound();

    void run(){
        System.out.println("Running.....");
    }
}

class Lion extends AbstractionDemoAnimal{
    @Override
    void sound() {
        System.out.println("Roars");
    }
}

class cat extends AbstractionDemoAnimal{
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

class Animal{
    public static void main(String[] args) {
    cat c=new cat();
    Lion l=new Lion();

    c.sound();
    c.run();

    l.sound();
    l.run();
    }
}
