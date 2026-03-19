package com.tms.solid.pattrens.template_method;

public abstract class Bar {

    //Шаблонный метод
    final void prepareDrink(){
        System.out.println("Готовим напиток.");
        boilWater();
        brew();
        pourInCup();
        addCondimets();
    }

    //Шаги которые придется описать
    abstract void brew();
    abstract void addCondimets();

    //Шаги которые у нас есть
    private void boilWater(){
        System.out.println("Кипятим воду.");
    }

    private void pourInCup(){
        System.out.println("Наливаем в чашку.");
    }
}
