package com.child;
import com.parent.Vehicle;;
public class Car extends Vehicle{
    int average;
    int tank_capacity;
    static String country;
    static{
        country = "USA";
    }
    

    public Car(String make, String model, int year, int average, int tank_capacity){
        super(make,model,year);
        this.average = average;
        this.tank_capacity  = tank_capacity;
    }
    public static String getCountry() {
        return country;
    }
    public int getAverage() {
        return average;
    }

    public int getTank_capacity() {
        return tank_capacity;
    }

    public void setAverage(int average) {
        this.average = average;
    }
    public void setTank_capacity(int tank_capacity) {
        this.tank_capacity = tank_capacity;
    }

    public static void main(String[] args) {
        Car obj = new Car("Chevrolet", "Camaro", 2010, 20, 50);
        System.out.println(obj.getModel()+" "+obj.getCountry()+" "+obj.getYear());
    }
}
