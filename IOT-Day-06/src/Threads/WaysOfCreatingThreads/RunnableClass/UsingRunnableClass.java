package Threads.WaysOfCreatingThreads.RunnableClass;

class UsingRunnableClass implements Runnable {
    public void run() {
//        System.out.println("Thread is Running");
        for (int j = 0; j < 10; j++)
            System.out.println("t1 Thread " + j);
    }
}

class Runn implements Runnable{
    public void run(){
        for(int i=10;i>0;i--)
            System.out.println("t2 Thread "+i);
    }
}

class RunnableDemo{
    public static void main(String[] args) {
        UsingRunnableClass thr1=new UsingRunnableClass();
        Runn r=new Runn();
        Thread t1=new Thread(thr1);
        Thread t2=new Thread(r);

        t1.start();
        t2.start();


    }
}
