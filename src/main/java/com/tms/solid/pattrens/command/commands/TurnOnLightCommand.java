package com.tms.solid.pattrens.command.commands;

import com.tms.solid.pattrens.command.Command;
import com.tms.solid.pattrens.command.Light;

public class TurnOnLightCommand implements Command {
    private final Light light;

    public TurnOnLightCommand() {
        this.light = new Light();
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
