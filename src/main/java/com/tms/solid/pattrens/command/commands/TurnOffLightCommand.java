package com.tms.solid.pattrens.command.commands;

import com.tms.solid.pattrens.command.Command;
import com.tms.solid.pattrens.command.Light;

public class TurnOffLightCommand implements Command {
    private final Light light;

    public TurnOffLightCommand() {
        this.light = new Light();
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
