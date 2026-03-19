package com.tms.solid.pattrens.facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Some logic");

        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.watchMovie("Harry Potter");
        facade.endMovie();
    }
}
