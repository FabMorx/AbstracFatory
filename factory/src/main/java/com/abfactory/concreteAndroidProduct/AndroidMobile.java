package com.abfactory.concreteAndroidProduct;

import com.abfactory.models.Mobile;

public class AndroidMobile  extends Mobile {
    
    public AndroidMobile(String model, String brand, String color, Integer space, Integer batteryCapacity,Integer simCapacity){
        super(model, brand, color, space, batteryCapacity, simCapacity);
    }
    @Override
    public void showFeature(){
        System.out.println("The model of the Android Mobile is:"+ getModel()+"brand: "+getBrand()+"color: "+getColor()+"space: "+getSpace()+"batteryCapacity"+getBatteryCapacity()+"SimCapacity: "+getSimCapacity()); 
   }
    
    
}
