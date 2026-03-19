package com.tms.solid.d.good;

public class TelegramService implements Notifyable {
    @Override
    public boolean sendMessage(String to, String message) {
        System.out.println("Send message in Telegram.");
        System.out.println("To: " + to);
        System.out.println("Message: " + message);
        return false;
    }
}
