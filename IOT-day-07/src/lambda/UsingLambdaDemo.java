package lambda;

interface UsingLambdaDemo {
    void sayHello();
}

class DemoUsingLambda{
    public static void main(String[] args) {
        UsingLambdaDemo obj = () -> {
            System.out.println("Hello world using lambda");
        };

        obj.sayHello();
    }
}