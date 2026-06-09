package com.abfactory;

import java.util.Scanner;

import com.abfactory.abstracFactory.DeviceFactory;
import com.abfactory.concreteFactory.AndroidDeviceFactory;
import com.abfactory.concreteFactory.IOSDeviceFactory;
import com.abfactory.models.Mobile;
import com.abfactory.models.Tablet;

// By FabMor

public class Main {
    public static Integer numMobile = 5;
    public static Integer numTablet = 4;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DeviceFactory factory;
        Mobile[] mobile = new Mobile[numMobile];
        Tablet[] tablet = new Tablet[numTablet];

        System.out.println("Create Device IOS (1)"+ "Device Android (2):");
        String election = keyboard.nextLine();
        if (election.equals("1")) {
            factory = new IOSDeviceFactory();
        }else{
            factory = new AndroidDeviceFactory();
        }

        for (int i = 0; i < mobile.length; i++) {
            mobile[i] = factory.createMobile(" S22+ ", " Samsung ", " Blue ", 256, 6500, 2);
        }
        for(Mobile mob :  mobile){
            mob.showFeature();
        }
        for (int j = 0; j < tablet.length; j++) {
            tablet[j] = factory.createTablet(" 2021 ", " huawei ", " white ", 15+j, 6000);
            
        }
        for(Tablet tab : tablet){
            tab.showFeature();
        }
       
    }
}