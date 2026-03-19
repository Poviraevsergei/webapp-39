package com.tms.solid.pattrens.adapter;

public class TelegramLogic {
    public boolean sendMessageToTelegram(String message, String username, String number) {
        try {
            System.out.println("Dear " + username);
            System.out.println("Send message to telegram: " + message);
            System.out.println("To number " + number);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        return false;
    }
}
