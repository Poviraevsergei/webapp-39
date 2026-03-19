package com.tms.solid.pattrens.decorator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Developer dev = new JavaDeveloper();

        boolean isEnable = rand.nextBoolean();
        if (isEnable) {
            dev = new ServletSkill(dev);
        }

        isEnable = rand.nextBoolean();
        if (isEnable) {
            dev = new DatabaseSkill(dev);
        }

        if (isEnable) {
            dev = new SpringSkill(dev);
        }

        dev.showSkill();
    }
}
