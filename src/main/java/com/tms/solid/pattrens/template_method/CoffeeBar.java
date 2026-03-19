package com.tms.solid.pattrens.template_method;

public class CoffeeBar extends Bar{
    @Override
    void brew() {
        System.out.println("Завариваем кофе.");
    }

    @Override
    void addCondimets() {
        System.out.println("Добавляем молоко.");
    }
}
