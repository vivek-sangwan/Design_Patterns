package org.viveksangwan;

public class DoubleLockSingleton implements  Singleton{
    private static DoubleLockSingleton instance;
    private DoubleLockSingleton(){};
    public static DoubleLockSingleton getInstance(){
        if(instance==null){
            synchronized(DoubleLockSingleton.class){
                if(instance==null) instance = new DoubleLockSingleton();
            }
        }
        return instance;
    }
}
