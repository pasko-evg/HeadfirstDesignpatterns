package com.pei.headfirst.designpatterns.singleton;

/**
 * Created by Cold on 13.06.2016.
 */
public class Singleton {
    private volatile static Singleton ourInstance = new Singleton();
    private String name = "Singleton";
    private long number = 1;

    public static Singleton getInstance() {
        if (ourInstance == null) {
            synchronized (Singleton.class) {
                if (ourInstance == null) {
                    ourInstance = new Singleton();
                }
            }
        }
        return ourInstance;
    }

    private Singleton() {
        System.out.println("Run constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Singleton {" +
                "name = '" + name + '\'' +
                ", number = " + number +
                '}';
    }
}
