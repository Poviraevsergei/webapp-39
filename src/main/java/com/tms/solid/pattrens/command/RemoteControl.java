package com.tms.solid.pattrens.command;

import java.util.LinkedList;
import java.util.List;

public class RemoteControl {
    List<Command> commandList;

    public RemoteControl() {
        commandList = new LinkedList<>();
    }

    public void setCommand(Command command) {
        commandList.addLast(command);
    }

    public void pressButton() {
        commandList.getFirst().execute();
        commandList.removeFirst();
    }
}
