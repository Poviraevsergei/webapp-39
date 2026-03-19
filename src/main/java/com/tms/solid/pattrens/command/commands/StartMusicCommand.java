package com.tms.solid.pattrens.command.commands;

import com.tms.solid.pattrens.command.Command;
import com.tms.solid.pattrens.command.Music;

public class StartMusicCommand implements Command {
    private final Music music;

    public StartMusicCommand() {
        this.music = new Music();
    }

    @Override
    public void execute() {
        music.on();
    }
}
