package abstraction.CompleteAbstraction;
//why interfaces are not 100% abstract
public interface AbstractionExample100NotAbstract {

    void show();

    default void display(){
        System.out.println("inside display default method");
    }

    static void message(){
        System.out.println("inside void static method");
    }
}

class MainAbstract{
    public static void main(String[] args) {
        AbstractionExample100NotAbstract.message();
    }
}
