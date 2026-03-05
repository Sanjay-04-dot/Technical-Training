package Threads;

import Threads.WaysOfCreatingThreads.ThreadClass.UsingThreadClass;

public class ControlOverThread extends Thread {
    @Override
    public void run() {
//        try {
//            Thread.sleep(10000);
//            System.out.println("Running....");
//        } catch (Exception e) {
////                throw new RuntimeException(e);
//        }

        for(int i=0;i<5;i++)
        {
            System.out.println("Child "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

class MultithreadDemo {
    public static void main(String[] args) {

   ControlOverThread t1= new ControlOverThread();
        t1.start();
    }
}

