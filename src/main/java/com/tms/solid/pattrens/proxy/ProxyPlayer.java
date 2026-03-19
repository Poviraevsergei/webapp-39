package com.tms.solid.pattrens.proxy;

public class ProxyPlayer implements Player {

    private Player player;
    private String videoName;

    public ProxyPlayer(String videoName) {
        this.videoName = videoName;
    }

    @Override
    public void play() {
        if (player == null) {
            player = new VideoPlayer(videoName);
        }
        player.play();
    }
}
