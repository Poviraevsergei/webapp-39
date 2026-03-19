package com.tms.solid.pattrens.decorator;

public class SkillDecorator implements Developer {
    private final Developer developer;

    public SkillDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void showSkill() {
        developer.showSkill();
    }
}
