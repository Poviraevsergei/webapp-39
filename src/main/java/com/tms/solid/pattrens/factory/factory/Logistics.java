package com.tms.solid.pattrens.factory.factory;

import com.tms.solid.pattrens.factory.model.Package;
import com.tms.solid.pattrens.factory.model.Transport;

public abstract class Logistics {

    public abstract Transport createTransport();

    public abstract Package createPackage();

    public void allDeliveryProcess() {
        Transport t = createTransport();
        System.out.println("Транспорт начинает доставку:");
        t.deliver();
        Package p = createPackage();
        System.out.println("Упаковка: ");
        p.pack();
    }
}
