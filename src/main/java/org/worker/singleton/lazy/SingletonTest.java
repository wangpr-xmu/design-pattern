package org.worker.singleton.lazy;

public class SingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SingletonThread());
        Thread thread2 = new Thread(new SingletonThread());

        thread1.start();
        thread2.start();

        System.out.println("main End");
    }
}
