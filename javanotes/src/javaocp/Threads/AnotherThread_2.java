package javaocp.Threads;

import static javaocp.Threads.ThreadColor.ANSI_BLUE;
import static javaocp.Threads.ThreadColor.ANSI_RED;

public class AnotherThread_2 extends Thread {


    @Override
    public void run() {
        System.out.println(ANSI_BLUE+ "hello from "+currentThread().getName());
        try{
            //Thread.interrupted();
            Thread.sleep(10000);

        }catch (InterruptedException e){
            //if thread is interrupted Interrupted Exception will thrown.
            System.out.println(ANSI_RED+" another thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE+"10 seconds have passed and i'm awake..");
    }
}
