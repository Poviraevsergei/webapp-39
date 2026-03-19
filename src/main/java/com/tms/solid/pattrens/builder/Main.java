package com.tms.solid.pattrens.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .email("test@gmail.com")
                .password("123")
                .phone("375291111111")
                .id(50)
                .build();
        System.out.println(user);
    }
}
