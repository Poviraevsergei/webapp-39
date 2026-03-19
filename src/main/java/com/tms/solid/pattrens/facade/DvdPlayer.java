package com.tms.solid.pattrens.facade;

public class DvdPlayer {
    public void on(){
        System.out.println("DvdPlayer включен");
    }

    public void off(){
        System.out.println("DvdPlayer выключен");
    }

    public void play(String movie){
        System.out.println("Воспроизведение фильма: " + movie);
    }

    public void stop(){
        System.out.println("Воспроизведение остановлено");
    }
}
