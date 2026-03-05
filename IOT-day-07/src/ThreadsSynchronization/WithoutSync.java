package ThreadsSynchronization;

public class WithoutSync {
    int count =0;

    void inc(){
        count++;
    }
}

class DemoWithoutSync{
    public static void main(String[] args) {

        WithoutSync w=new WithoutSync();

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
