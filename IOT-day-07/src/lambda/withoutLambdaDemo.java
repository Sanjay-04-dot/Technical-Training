package lambda;

interface withoutLambdaDemo {
    void sayHello();
}

class DemoWithoutLambda{
    public static void main(String[] args) {
        withoutLambdaDemo lam=new withoutLambdaDemo() {
            @Override
            public void sayHello() {
                System.out.println("Hello world");
            }
        };

        lam.sayHello();
    }
}
