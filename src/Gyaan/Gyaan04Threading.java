package Gyaan;


class mutliT implements Runnable{
    int threadNumber;
    public mutliT(int i) {this.threadNumber = i;}
    @Override
    public void run(){
        String a = "abc";
        for (int i = 0; i < a.length(); i++){
            System.out.println(a.charAt(i) + " Thread number = " + threadNumber);
        }
    }
}

public class Gyaan04Threading {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++){
            Thread t1 = new Thread(new mutliT(i));
            t1.start();
            t1.join();
        }
    }
}

