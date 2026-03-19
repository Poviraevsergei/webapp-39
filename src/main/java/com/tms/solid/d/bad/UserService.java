package com.tms.solid.d.bad;

public class UserService {
    private final EmailService emailService;

    public UserService() {
        this.emailService = new EmailService();
    }

    public boolean registration() {
        //процесс регистрации
        if (true) {
            emailService.sendMessage("Alex", "Good news");
        }
        return true;
    }
}
