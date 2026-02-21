package Methods;

public class Method02Example {
    int a;
    int b;


    Method02Example(int a, int b) {
        this.a = a;
        this.b = b;
    }



    int display(){
        return (a + b);
    }



    public static void main(String[] args) {
        Method02Example meth1 = new Method02Example(10, 20);
        Method02Example meth2 = new Method02Example(40,50);

        System.out.println("Meth1 Sum: "+meth1.display());
        System.out.println("Meth2 Sum: "+meth2.display());

    }
}
