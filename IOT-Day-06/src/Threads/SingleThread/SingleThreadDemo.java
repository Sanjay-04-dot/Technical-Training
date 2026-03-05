package Threads.SingleThread;

public class SingleThreadDemo {
    public static void main(String[] args) {

        System.out.println("Main thread Startes");
        for(int i=0;i<5;i++)
        {
            System.out.println(i+1);
        }
        System.out.println("Main Thread Stopped");
    }
}
