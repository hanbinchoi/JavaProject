package com.company;

public class Dog extends Animal {
    @Override
    public void move() {
        super.move();
    }

    @Override
    public void eatFood() {
        System.out.println("Dog");
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.eatFood();
        dog.eatFood();
    }
}
