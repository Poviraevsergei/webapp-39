package com.tms.solid.pattrens.proxy.easier;

public class Main {
    public static void main(String[] args) {
        Transport t = new ProxyCar(new Car());
        t.start();
    }
}
