package com.pei.headfirst.designpatterns.templateMethod;

public class Tea extends CaffeineRecipe {

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected  void brew() {
        System.out.println("Steeping the tea");
    }
}
