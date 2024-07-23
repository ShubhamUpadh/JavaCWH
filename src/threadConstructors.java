class threadRun extends Thread{
    public threadRun(String name){
        super(name);
    }
    public void run() {
        int i = 10;
        while (i < 11) {
            System.out.println("I am a thread");
            i++;
        }
    }
}
class threadRunnable implements Runnable{
    public void run(){
        System.out.println("Runnable waali class");
    }
}
class threadRun2 extends Thread{
    public threadRun2(Runnable r, String Name){
        super(r, Name);
    }
    @Override
    public void run(){
        System.out.println("Hello");
    }

}

public class threadConstructors {
    public static void main(String[] args) {
        threadRunnable run = new threadRunnable();
        threadRun2 tr2 = new threadRun2(run,"Thread Name is h2h");
        System.out.println(tr2.threadId());
        System.out.println(tr2.getName());
//
//        threadRun tr = new threadRun("Shubham");
//        System.out.println("The id of thread is " + tr.threadId());
//        System.out.println("The name of thread is " + tr.getName());
//        System.out.println(tr.getPriority());
//
//        threadRun2 tr2 = new threadRun2()
    }
}
