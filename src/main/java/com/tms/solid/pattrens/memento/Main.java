package com.tms.solid.pattrens.memento;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Cat cat = new Cat("Bob", 1);

        //делаем сохранение состояния
        storage.addMemento("bob1",cat.save());

        cat.setAge(2);
        storage.addMemento("bob2",cat.save());

        cat.setAge(3);
        cat.setName("Arnold");
        storage.addMemento("arnold3",cat.save());

        System.out.println(cat);

        cat.restore(storage.getMemento("bob1"));
        System.out.println(cat);

        cat.restore(storage.getMemento("arnold3"));
        System.out.println(cat);
    }
}
