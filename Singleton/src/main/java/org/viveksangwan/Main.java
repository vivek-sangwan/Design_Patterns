package org.viveksangwan;

public class Main {
    public static void main(String[] args) {
        Singleton eager1 = EagerSingleton.getInstance();
        Singleton eager2 = EagerSingleton.getInstance();
        System.out.println(eager1+" "+eager2);
    }
}
