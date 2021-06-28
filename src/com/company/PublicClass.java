package com.company;

public class PublicClass {
    static class StaticNested{
        private int value = 0;
        public int getValue(){
            return value;
        }
        public void setValue(int value){
            this.value = value;
        }
    }

    public static void main(String[] args){
        PublicClass.StaticNested staticNested = new PublicClass.StaticNested();
        staticNested.setValue(3);
        System.out.println(staticNested.getValue());
    }


}


