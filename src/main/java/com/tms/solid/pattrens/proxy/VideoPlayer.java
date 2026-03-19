package com.tms.solid.pattrens.proxy;

public class VideoPlayer implements Player {
    private String videoName;

    public VideoPlayer(String videoName) {
        this.videoName = videoName;
        System.out.println("Скачиваем долго: " + videoName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void play() {
        System.out.println("Воспроизведение скачанного видео: " + videoName);
    }
}
