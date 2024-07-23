class myThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
        System.out.println("Runnable 1");
    }
}

class myThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
        System.out.println("Runnable 2");
    }
}

public class multithreadingRunnableInterface {
    public static void main(String[] args) {
        myThreadRunnable1 r1 = new myThreadRunnable1();
        myThreadRunnable2 r2 = new myThreadRunnable2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
