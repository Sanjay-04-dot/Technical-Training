package Threads.WaysOfCreatingThreads.ThreadClass;

public class UsingThreadClassMultiThread extends Thread {
    @Override
    public void run() {
//        System.out.println("Running....");
        for (int i = 0; i < 5; i++)
            System.out.println(i + " Child Thread");
    }
}

class MultithreadDemoex2 {
    public static void main(String[] args) {

        UsingThreadClassMultiThread th1 = new UsingThreadClassMultiThread();
        th1.start();
        for (int j = 5; j > 0; j--) {
            System.out.println(j + " Main Thread");
        }

    }
}

