package MultipleInheritance;
interface mom {
    default void cook(){
        System.out.println("Mom prepares food");
    }
}

interface dad{
    default void cook(){
        System.out.println("Dad prepares food");
    }
}

class child implements mom,dad{
    @Override
    public void cook() {
        mom.super.cook();
        dad.super.cook();
    }
}

class MomDadChild{
    public static void main(String[] args) {
        child c = new child();
        c.cook();
    }
}
