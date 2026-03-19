package com.tms.solid.pattrens.facade;

public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Screen screen;

    public HomeTheaterFacade() {
        this.dvdPlayer = new DvdPlayer();
        this.screen = new Screen();
    }

    public void watchMovie(String movie) {
        screen.down();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        dvdPlayer.stop();
        screen.up();
        dvdPlayer.off();
    }
}
