package com.tms.solid.pattrens.command.commands;

import com.tms.solid.pattrens.command.Command;
import com.tms.solid.pattrens.command.Music;

public class MakeSoundHigherCommand implements Command {
    private final Music music;

    public MakeSoundHigherCommand() {
        this.music = new Music();
    }

    @Override
    public void execute() {
        music.makeSoundHigher();
    }
}
