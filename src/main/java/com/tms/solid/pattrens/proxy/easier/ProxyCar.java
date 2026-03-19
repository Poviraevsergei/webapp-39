package com.tms.solid.pattrens.proxy.easier;

public class ProxyCar implements Transport {
    private Car car;

    public ProxyCar(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        System.out.println("IN: ProxyCar start logic");
        car.start();
    }

    @Override
    public void stop() {
        System.out.println("IN: ProxyCar stop logic");
        car.stop();
        System.out.println("OUT: ProxyCar stop logic");
    }
}
