package java.OracleOCP.Concurrency;

public class MyRunnable implements Runnable {
    private int count=0;

    @Override
    public void run() {
        Object myObject=new Object();
        System.out.println(myObject);
        for(int i=0;i<1_000_000;i++) {
            synchronized (this){
                this.count++;
            }

        }

        System.out.println(Thread.currentThread().getName()+ " : "+this.count);
    }
}
