package Methods;

public class Method01 {

    static void display(){
        System.out.println("hello world");
    }

    static{
        System.out.println("hello world hello world");
    }

   int add(int a,int b)
    {
        return a+b;
    }

    static int sub(int a, int b)
    {
        return a-b;
    }

    public static void main(String [] args){

       System.out.println("ehllo");
        Method01 meth = new Method01();

        meth.display();

        int sum=meth.add(5,6);
        System.out.println(sum);


        int diff=sub(5,6);
        System.out.println(diff);

    }
}
