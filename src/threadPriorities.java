class threads1 extends Thread{
    public threads1(String name){
        super(name);
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i ++) System.out.println("Running this thread" + this.getName());
    }
}

public class threadPriorities {
    public static void main(String[] args) {

        threads1 t1 = new threads1("name1");
        threads1 t2 = new threads1("name2 -> Max Priority");
        threads1 t3 = new threads1("name3");
        threads1 t4 = new threads1("name4");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
