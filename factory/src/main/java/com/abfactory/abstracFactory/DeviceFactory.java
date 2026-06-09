package com.abfactory.abstracFactory;

import com.abfactory.models.Mobile;
import com.abfactory.models.Tablet;

public interface DeviceFactory {
    Mobile createMobile(String model, String brand, String color, Integer space, Integer batteryCapacity,Integer simCapacity);
    Tablet createTablet(String model, String brand, String color, Integer space, Integer batteryCapacity);
    
}
