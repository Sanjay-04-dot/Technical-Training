package Threads;

public class ThreadJoinExample extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
            System.out.println("child Thread "+i);
    }
}

class DemoJoin{
    public static void main(String[] args) throws Exception{
        ThreadJoinExample t1=new ThreadJoinExample();

        t1.start();

        t1.join();
        System.out.println("Main thread Executed");
    }
}
