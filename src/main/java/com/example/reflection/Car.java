package com.example.reflection;

import java.util.StringJoiner;

public class Car {
    private String country;
    private String brand;
    private Integer year;


    public Car() {
        this.country = "Germany";
        this.brand = "BMW";
        this.year = 2015;
    }

    public Car(String country, String brand, Integer year) {
        this.country = country;
        this.brand = brand;
        this.year = year;
    }
    public void price(Integer year){
        year+=1;
    }
    @Override
    public String toString() {
        return "Car{" +
                "country='" + country + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
