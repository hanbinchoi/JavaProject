package com.company;

public interface EventListener {
    public void onClick();
    int asd = 2;
    default void add2(int a, int b){
        System.out.println(a+b);
    }
    static void add3(int a, int b){
        System.out.println(a-b);
    }
}
