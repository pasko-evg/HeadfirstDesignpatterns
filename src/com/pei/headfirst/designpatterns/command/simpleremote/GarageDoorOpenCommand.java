package com.pei.headfirst.designpatterns.command.simpleremote;

/**
 * Created by Cold on 13.06.2016.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor = new GarageDoor();

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
