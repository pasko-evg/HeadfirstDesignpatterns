package com.pei.headfirst.designpatterns.command.simpleremote;

/**
 * Created by Cold on 13.06.2016.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() { }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
