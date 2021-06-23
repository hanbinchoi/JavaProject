package com.company;

public class CarManager {
    public static void main(String[] args){
        Car aCar = new Car();
        aCar.speedUp();
        aCar.speedUp();
        System.out.println(aCar.getCurrentSpeed());
        aCar.breakDown();
        System.out.println(aCar.getCurrentSpeed());
    }
}