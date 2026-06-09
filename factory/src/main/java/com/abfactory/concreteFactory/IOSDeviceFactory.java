package com.abfactory.concreteFactory;

import com.abfactory.abstracFactory.DeviceFactory;
import com.abfactory.concreteIOSProduct.IOSMobile;
import com.abfactory.concreteIOSProduct.IOSTablet;
import com.abfactory.models.Mobile;
import com.abfactory.models.Tablet;

public class IOSDeviceFactory  implements DeviceFactory {

    @Override
    public Mobile createMobile(String model, String brand, String color, Integer space, Integer batteryCapacity,
            Integer simCapacity) {
      return new IOSMobile(model, brand, color, space, batteryCapacity, simCapacity);
    }

    @Override
    public Tablet createTablet(String model, String brand, String color, Integer space, Integer batteryCapacity) {
      return new IOSTablet(model, brand, color, space, batteryCapacity);
    }

    
}
