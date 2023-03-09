package com.cursojava.intermediario.aula67;

public class MyThread extends Thread {

    private final String name;
    private final int sleepTime;
    private static int count = 1;

    public MyThread(int sleepTime) {
        this.name = "Thread#" + count;
        this.sleepTime = sleepTime;
        count++;
        this.start();
    }

    @Override
    public void run() {

        System.out.println("Execute thread: " + this.name);

        try {

            for (int i = 0; i <= 5; i++) {
                System.out.println(this.name + " --> count: " + i);
                Thread.sleep(sleepTime);
            }

        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
