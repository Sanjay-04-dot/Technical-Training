package Threads.WaysOfCreatingThreads.ThreadClass;

public class UsingThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Running....");
    }
}

class MultithreadDemo{
    public static void main(String[] args) {

        UsingThreadClass t1=new UsingThreadClass();
        t1.start();
    }
}
