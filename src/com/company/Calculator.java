package com.company;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args){
        System.out.println("Started");

        Calculator calc = new Calculator();
        System.out.println(calc.add(1,1));
        System.out.println(calc.sub(1,1));
        System.out.println(calc.multiply(1,1));
        System.out.println(calc.divide(1,1));

    }
}
