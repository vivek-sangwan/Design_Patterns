package org.example;
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("p1",22);
        Person p2 = (Person) p1.clone();
        p2.setName("p2");

        System.out.println(p1+" "+p2);
    }
}