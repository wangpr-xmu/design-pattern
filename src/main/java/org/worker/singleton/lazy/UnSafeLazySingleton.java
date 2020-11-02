package org.worker.singleton.lazy;

public class UnSafeLazySingleton {
    private static UnSafeLazySingleton instance;


    private UnSafeLazySingleton(){}


    public static UnSafeLazySingleton getInstance() {
        if(instance == null) {
            instance = new UnSafeLazySingleton();
        }
        return instance;
    }
}
