package com.cursojava.intermediario.aula69;

public class MyThreadRunnable implements Runnable {

    private static int count = 1;
    private final String name;
    private final int sleepTime;

    public MyThreadRunnable(int sleepTime) {
        this.name = "Thread#" + count;
        this.sleepTime = sleepTime;
        count++;
    }

    @Override
    public void run() {

        System.out.println(this.name + " starts running.");

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(this.name + " ---> count: " + i);
                Thread.sleep(sleepTime);
            }

        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(this.name + " finish.");
    }
}
