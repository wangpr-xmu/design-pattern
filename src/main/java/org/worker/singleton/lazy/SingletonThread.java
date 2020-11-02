package org.worker.singleton.lazy;

public class SingletonThread implements Runnable {

    @Override
    public void run() {

        DoubleCheckLazySingleton instance = DoubleCheckLazySingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
