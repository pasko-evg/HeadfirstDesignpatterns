package com.pei.headfirst.designpatterns.templateMethod;

public class Coffe extends CaffeineRecipe {

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
