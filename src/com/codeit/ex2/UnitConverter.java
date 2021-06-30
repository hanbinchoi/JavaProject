package com.codeit.ex2;

public class UnitConverter {
    // 필요한 상수 정의
    static final double KILOGRAMS_PER_POUND = 0.45359237;
    static final double POUNDS_PER_KILOGRAM = 1/KILOGRAMS_PER_POUND;
    static final double CENTIMETERS_PER_INCH = 2.54;
    static final double INCHES_PER_CENTIMETER = 1/CENTIMETERS_PER_INCH;
    private UnitConverter(){

    }
    public static double toPounds(double kilograms) {
        // 메소드 내부를 채워주세요
        return kilograms*POUNDS_PER_KILOGRAM;
    }
    public static double toKilograms(double pounds) {
        // 메소드 내부를 채워주세요
        return pounds*KILOGRAMS_PER_POUND;
    }
    public static double toCentimeters(double inches) {
        // 메소드 내부를 채워주세요
        return inches*CENTIMETERS_PER_INCH;
    }
    public static double toInches(double centimeters) {
        // 메소드 내부를 채워주세요
        return centimeters*INCHES_PER_CENTIMETER;
    }
    public static double toFahrenheit(double celsius) {
        // 메소드 내부를 채워주세요
        return celsius * (9/5.0) + 32;
    }
    public static double toCelsius(double fahrenheit) {
        // 메소드 내부를 채워주세요
        return (fahrenheit-32) * (double)(5/9.0);
    }
}