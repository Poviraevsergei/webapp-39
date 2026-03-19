package com.tms.solid.pattrens.memento;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private final Map<String, Memento> mementos;

    public Storage() {
        mementos = new HashMap<>();
    }

    public void addMemento(String key, Memento memento) {
        mementos.put(key, memento);
    }

    public Memento getMemento(String key) {
        return mementos.get(key);
    }
}
