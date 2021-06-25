package com.company;

public class Equals {
    public static void main(String[] args){
        Equals thisObject = new Equals();
        thisObject.equalMethod();
    }
    public void equalMethod() {
        MemberDTO obj1 = new MemberDTO("Alex");
        MemberDTO obj2 = new MemberDTO("Alex");
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        if(obj1 == obj2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
