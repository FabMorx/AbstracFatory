package com.abfactory.models;

public  abstract class Mobile {
    private String model;
    private String brand;
    private String color;
    private Integer space;
    private Integer batteryCapacity;
    private Integer simCapacity;
    public Mobile(String model, String brand, String color, Integer space, Integer batteryCapacity,
            Integer simCapacity) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.space = space;
        this.batteryCapacity = batteryCapacity;
        this.simCapacity = simCapacity;
    }
    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public Integer getSpace() {
        return space;
    }
    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }
    public Integer getSimCapacity() {
        return simCapacity;
    }
    public  abstract  void showFeature();
    

    
}
