package com.tms.solid.pattrens.command;

import com.tms.solid.pattrens.command.commands.MakeSoundHigherCommand;
import com.tms.solid.pattrens.command.commands.StartMusicCommand;
import com.tms.solid.pattrens.command.commands.TurnOnLightCommand;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new TurnOnLightCommand());
        remoteControl.setCommand(new StartMusicCommand());
        remoteControl.setCommand(new MakeSoundHigherCommand());

        Thread.sleep(500);
        remoteControl.pressButton();

        Thread.sleep(500);
        remoteControl.pressButton();

        Thread.sleep(500);
        remoteControl.pressButton();
    }
}
