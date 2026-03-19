package com.tms.solid.pattrens.adapter;

public class SmsSender implements ISender {

    @Override
    public void send(String message, String to) {
        System.out.println("SMS SENDER");
        System.out.println("Send message to: " + to);
        System.out.println("Message : " + message);
    }
}
