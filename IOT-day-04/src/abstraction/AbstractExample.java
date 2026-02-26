package abstraction;

abstract class AbstractExample{
    abstract void calculateArea();

    void display(){
        System.out.println("shapes....");
    }
}

class rectangle extends AbstractExample{
    void calculateArea(){
        System.out.println("Area of Rectangle is: "+(10*20));
    }
}

class Circle extends AbstractExample{
    void calculateArea(){
        System.out.println("Area of Circle is: "+(2*3.14*(10*10)));
    }
}
class Area{
    public static void main(String[] args) {
        Circle c=new Circle();
        rectangle r=new rectangle();
        c.display();
        c.calculateArea();

        r.display();
        r.calculateArea();
    }
}

