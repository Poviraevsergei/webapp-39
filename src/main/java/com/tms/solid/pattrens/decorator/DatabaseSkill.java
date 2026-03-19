package com.tms.solid.pattrens.decorator;

public class DatabaseSkill extends SkillDecorator {
    public DatabaseSkill(Developer developer) {
        super(developer);
    }

    @Override
    public void showSkill() {
        super.showSkill();
        System.out.println("I also know how to work with databases :)");
    }
}
