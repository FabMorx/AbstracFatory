package com.abfactory.concreteAndroidProduct;

import com.abfactory.models.Tablet;

public class AndroidTablet  extends Tablet{
    public AndroidTablet (String model, String brand, String color, Integer space, Integer batteryCapacity){
        super(model, brand, color, space, batteryCapacity);
    }


    @Override
    public void showFeature() {
        System.out.println("The model  of the Android Tablet is:"+ getModel()+"brand: "+getBrand()+"color: "+getColor()+"space: "+getSpace()+"batteryCapacity"+getBatteryCapacity()); 
    }
    
}
