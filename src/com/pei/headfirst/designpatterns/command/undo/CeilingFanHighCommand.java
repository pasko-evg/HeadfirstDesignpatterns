package com.pei.headfirst.designpatterns.command.undo;

/**
 * Created by Cold on 13.06.2016.
 */
public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() throws Exception {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high(); break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium(); break;
            case CeilingFan.LOW:
                ceilingFan.low(); break;
            case CeilingFan.OFF:
                ceilingFan.off(); break;
            default: throw new Exception("Unusual celling fan state");
        }
    }
}
