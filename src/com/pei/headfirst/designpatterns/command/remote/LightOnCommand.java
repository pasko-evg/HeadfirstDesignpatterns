package com.pei.headfirst.designpatterns.command.remote;

/**
 * Created by Cold on 13.06.2016.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}