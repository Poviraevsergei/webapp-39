package com.tms.solid.pattrens.decorator;

public class SpringSkill extends SkillDecorator{
    public SpringSkill(Developer developer) {
        super(developer);
    }

    @Override
    public void showSkill() {
        super.showSkill();
        System.out.println("I know Spring :)");
    }
}
