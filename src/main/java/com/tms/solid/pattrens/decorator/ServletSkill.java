package com.tms.solid.pattrens.decorator;

public class ServletSkill extends SkillDecorator {
    public ServletSkill(Developer developer) {
        super(developer);
    }

    @Override
    public void showSkill() {
        super.showSkill();
        System.out.println("I also know Servlet logic :)");
    }
}
