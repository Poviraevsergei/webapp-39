package com.tms.solid.pattrens.factory;

import com.tms.solid.pattrens.factory.factory.Logistics;
import com.tms.solid.pattrens.factory.factory.RoadLogistics;

public class Main {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.allDeliveryProcess();
    }
}
