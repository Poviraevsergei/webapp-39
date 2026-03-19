package com.tms.solid.d.good;

public class EmailService implements Notifyable {

    @Override
    public boolean sendMessage(String to, String message) {
        System.out.println("Отправляет сообщение на email");
        System.out.println("To: " + to);
        System.out.println("Info: " + message);
        return true;
    }
}
