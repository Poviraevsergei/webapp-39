package com.tms.solid.pattrens.adapter;

public class Main {
    public static void main(String[] args) {
        BusinessService businessService = new BusinessService(new TelegramAdapter());
        businessService.secondMethod();
    }
}
