package com.abfactory.models;

public  abstract class Tablet {
    private String model;
    private String brand;
    private String color;
    private Integer space;
    private Integer batteryCapacity;

    public Tablet(String model, String brand, String color, Integer space, Integer batteryCapacity) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.space = space;
        this.batteryCapacity = batteryCapacity;
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
    public  abstract  void showFeature();
    
    

}
