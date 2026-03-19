package com.tms.solid.pattrens.template_method;

public class TeaBar extends Bar {
    @Override
    void brew() {
        System.out.println("Завариваем чай.");
    }

    @Override
    void addCondimets() {
        System.out.println("Добавляем лимон.");
    }
}
