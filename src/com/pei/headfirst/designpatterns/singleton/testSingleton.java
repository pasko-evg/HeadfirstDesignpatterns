package com.pei.headfirst.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cold on 13.06.2016.
 */
public class testSingleton {
    public static void main(String[] args) {
        List<Singleton> singletons = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Singleton singleton = Singleton.getInstance();
            singleton.setName("Singleton.Class");
            singleton.setNumber((long)i);
            //singleton.toString();
            singletons.add(singleton);
        }

        for (Singleton singleton : singletons) {
            System.out.println(singleton.toString());
        }
    }
}
