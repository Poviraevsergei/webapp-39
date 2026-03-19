package com.tms.solid.pattrens.adapter;

public class TelegramAdapter extends TelegramLogic implements ISender {

    @Override
    public void send(String message, String to) {
        //логика поиска username
        String username = "Dima";
        sendMessageToTelegram(message, username,to);
    }
}

/*
public class TelegramAdapter implements ISender {
    private final TelegramLogic telegramLogic = new TelegramLogic();

    @Override
    public void send(String message, String to) {
        //логика поиска username
        String username = "Dima";
        telegramLogic.sendMessageToTelegram(message, username,to);
    }
}
 */
