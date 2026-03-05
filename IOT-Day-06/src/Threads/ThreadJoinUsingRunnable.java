package Threads;

public class ThreadJoinUsingRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
            System.out.println("child Thread "+i);
    }
}

class JoinUsingRunnable{
    public static void main(String[] args) throws Exception {
        ThreadJoinUsingRunnable t1=new ThreadJoinUsingRunnable();
        Thread th1=new Thread(t1);
        th1.start();
        th1.join();

        System.out.println("Thread Executed");

    }
}
