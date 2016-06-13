package com.pei.headfirst.designpatterns.command.undo;

/**
 * Created by Cold on 13.06.2016.
 */
public interface Command {
    void execute();
    void undo() throws Exception;
}
