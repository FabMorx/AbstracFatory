package com.abfactory.concreteIOSProduct;

import com.abfactory.models.Tablet;

public class IOSTablet  extends Tablet {
    public IOSTablet(String model, String brand, String color, Integer space, Integer batteryCapacity) {
        super(model, brand, color, space, batteryCapacity);
       
    }


    @Override
    public void showFeature() {
        System.out.println("The model of the IOS Tablet is:"+ getModel()+"brand: "+getBrand()+"color: "+getColor()+"space: "+getSpace()+"batteryCapacity"+getBatteryCapacity()+"SimCapacity: ");


    }
    
}
