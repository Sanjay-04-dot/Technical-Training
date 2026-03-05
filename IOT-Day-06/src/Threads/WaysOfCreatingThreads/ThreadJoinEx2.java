package Threads.WaysOfCreatingThreads;

public class ThreadJoinEx2 extends Thread {
    Thread other;

    ThreadJoinEx2(Thread other) {
        this.other = other;
    }

    public void run() {
        try {
            if (other != null) {
                other.join();
            }
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class MainThread{
    public static void main(String[] args) {
        ThreadJoinEx2 t1=new ThreadJoinEx2(null);
        ThreadJoinEx2 t2=new ThreadJoinEx2(t1);

        t1.start();
        t2.start();
    }
}

