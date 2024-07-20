class myThread extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("Hello");
            System.out.println("Thread is running");
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread2 is running");

        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
