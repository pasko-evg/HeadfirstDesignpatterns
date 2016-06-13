package com.pei.headfirst.designpatterns.command.simpleremote;

/**
 * Created by Cold on 13.06.2016.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(lightOff);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageDoorOpen);
        remoteControl.buttonWasPressed();
    }
}
