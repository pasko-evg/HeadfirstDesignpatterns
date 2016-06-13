package com.pei.headfirst.designpatterns.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("+++ Start Mallard Dusk +++");
        Duck mallard = new MallardDusk();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("\n+++ Start Model Dusk +++");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
