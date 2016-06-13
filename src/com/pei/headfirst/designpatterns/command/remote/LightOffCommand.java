package com.pei.headfirst.designpatterns.command.remote;

/**
 * Created by Cold on 13.06.2016.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}