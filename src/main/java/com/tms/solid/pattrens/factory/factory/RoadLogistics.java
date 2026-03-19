package com.tms.solid.pattrens.factory.factory;

import com.tms.solid.pattrens.factory.model.Box;
import com.tms.solid.pattrens.factory.model.Package;
import com.tms.solid.pattrens.factory.model.Transport;
import com.tms.solid.pattrens.factory.model.Truck;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }

    @Override
    public Package createPackage() {
        return new Box();
    }
}
