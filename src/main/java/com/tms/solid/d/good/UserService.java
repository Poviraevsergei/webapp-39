package com.tms.solid.d.good;


public class UserService {
    private final Notifyable notifyable;

    public UserService() {
        notifyable = new TelegramService();
    }

    public boolean registration() {
        //процесс регистрации
        if (true) {
            notifyable.sendMessage("Alex", "Good news");
        }
        return true;
    }
}
