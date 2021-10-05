package javaocp.Threads;


import static javaocp.Threads.ThreadColor.ANSI_RED;

public class MyRunnable_3 implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello from my runnable implementation run()");
    }
}
