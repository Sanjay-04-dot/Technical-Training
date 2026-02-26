package abstraction;

abstract class AbstractExampleWithStaticMethod {
    static void info(){
        System.out.println("Sanjay: The Captain");
    }

    abstract void teamMembers();
}

class temmates extends AbstractExampleWithStaticMethod{
    void teamMembers(){
        System.out.println("1. Nischitha\n2. Nisha");
    }
}

class Captain{
    public static void main(String[] args) {
        temmates t=new temmates();

        AbstractExampleWithStaticMethod.info();
        System.out.println("Team Members");
        t.teamMembers();

    }
}
