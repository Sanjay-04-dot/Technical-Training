package Inheritance;

public class SingleLevel {
    void displayparent() {
        System.out.println("This is parent class");
    }
}

class childclass extends SingleLevel {
    void displaychild() {
        System.out.println("This is child class");
    }
}

class Single{
    public static void main(String[] args) {

        childclass child = new childclass();
        child.displayparent();
        child.displaychild();

        SingleLevel parent= new SingleLevel();
        System.out.println("displaying the parent class using parent class object");
        parent.displayparent();

    }


}
