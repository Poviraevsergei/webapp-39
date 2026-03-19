package com.tms.solid.pattrens.prototype;

public class Robot implements Prototype {
    private int version;
    private String name;

    public Robot(int version, String name) {
        this.version = version;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Robot(version, name);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "version=" + version +
                ", name='" + name + '\'' +
                '}';
    }
}
