package com.security.demo.Examples.Threads;

import static com.security.demo.Examples.Threads.ThreadColor.ANSI_RED;

public class MyRunnable_3 implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello from my runnable implementation run()");
    }
}
