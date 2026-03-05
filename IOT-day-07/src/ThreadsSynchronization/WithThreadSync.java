package ThreadsSynchronization;

class WithThreadSync {
    int count =0;

   synchronized void inc(){
        count++;
    }
}

class DemoSync{
    public static void main(String[] args) {

        WithThreadSync w=new WithThreadSync();

        Thread t1=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                w.inc();
            }
        });

        Thread t2=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                w.inc();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(w.count);
    }
}
