package org.viveksangwan;

public class SynchronizedSingleton implements Singleton{
    private static SynchronizedSingleton instance;
    private SynchronizedSingleton(){};
    synchronized public static SynchronizedSingleton getInstance(){
        if(instance!=null) instance = new SynchronizedSingleton();
        return instance;
    }
}
