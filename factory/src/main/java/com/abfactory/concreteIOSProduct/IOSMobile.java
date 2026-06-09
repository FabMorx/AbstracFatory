package com.abfactory.concreteIOSProduct;

import com.abfactory.models.Mobile;

public class IOSMobile extends Mobile {
    public IOSMobile(String model, String brand, String color, Integer space, Integer batteryCapacity,
            Integer simcardCapatity) {
        super(model, brand, color, space, batteryCapacity, simcardCapatity);
       
    }


    @Override
    public void showFeature() {
        System.out.println("The model of the IOS Mobile is:"+ getModel()+"brand: "+getBrand()+"color: "+getColor()+"space: "+getSpace()+"batteryCapacity"+getBatteryCapacity()+"SimCapacity: "+getSimCapacity());
   
    }
    
}
