package com.tms.solid.pattrens.factory.factory;

import com.tms.solid.pattrens.factory.model.Container;
import com.tms.solid.pattrens.factory.model.Package;
import com.tms.solid.pattrens.factory.model.Ship;
import com.tms.solid.pattrens.factory.model.Transport;

public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }

    @Override
    public Package createPackage() {
        return new Container();
    }
}
