package com.tms.solid.l.easy.good;

import com.tms.solid.l.easy.bad.Bird;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }
}
