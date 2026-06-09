package com.abfactory.concreteFactory;

import com.abfactory.abstracFactory.DeviceFactory;
import com.abfactory.concreteAndroidProduct.AndroidMobile;
import com.abfactory.concreteAndroidProduct.AndroidTablet;
import com.abfactory.models.Mobile;
import com.abfactory.models.Tablet;

public class AndroidDeviceFactory  implements DeviceFactory{

    @Override
    public Mobile createMobile(String model, String brand, String color, Integer space, Integer batteryCapacity,
            Integer simCapacity) {
        return new AndroidMobile(model, brand, color, space, batteryCapacity, simCapacity);    
    
    }

    @Override
    public Tablet createTablet(String model, String brand, String color, Integer space, Integer batteryCapacity) {
        return new AndroidTablet(model, brand, color, space, batteryCapacity);
      
    }
    
}
