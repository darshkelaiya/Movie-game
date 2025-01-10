package com.parent;

public class Vehicle {
    
    String make;
    String model;
    protected int year;
    public Vehicle(String make, String model, int year){
        this.make =  make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static void main(String[] args) {
        
    }
}
