package com.ming.el;

public class Car {

    private String brand;

    private double price;

    //周长
    private double tyrperimeter;


    public Car(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTyrperimeter() {
        return tyrperimeter;
    }

    public void setTyrperimeter(double tyrperimeter) {
        this.tyrperimeter = tyrperimeter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", tyrperimeter=" + tyrperimeter +
                '}';
    }
}
