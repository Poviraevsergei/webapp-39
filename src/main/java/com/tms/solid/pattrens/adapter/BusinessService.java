package com.tms.solid.pattrens.adapter;

public class BusinessService {
    private final ISender sender;

    public BusinessService(ISender sender) {
        this.sender = sender;
    }

    void firstMethod() {
        System.out.println("first method");
        sender.send("first","");
    }

    void secondMethod() {
        System.out.println("second method");
        sender.send("second","");
    }
}
