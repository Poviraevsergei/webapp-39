package com.tms.solid.pattrens.prototype;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(1,"Robocop");

        Robot robot2 = (Robot) robot.clone();

        System.out.println(robot);
        System.out.println(robot2);
    }
}
