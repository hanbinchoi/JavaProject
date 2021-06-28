package com.company;

public class OuterOfInner {
    class Inner{
        private int value=0;
        public int getValue(){
            return value;
        }
        public void setValue(int value){
            this.value=value;
        }
    }

    public static void main(String[] args){
        OuterOfInner out = new OuterOfInner();
        OuterOfInner.Inner inner = out.new Inner();
        inner.setValue(3);
        System.out.println(inner.getValue());
    }
}
