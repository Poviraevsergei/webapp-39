package com.tms.solid.d.bad;

public class EmailService {
    public boolean sendMessage(String to, String info) {
        System.out.println("Отправляет сообщение на email");
        System.out.println("To: " + to);
        System.out.println("Info: " + info);
        return true;
    }
}
