package com.company;

public class ThrowableSample {
    public static void main(String[] args) throws Exception{
        ThrowableSample sample = new ThrowableSample();
        sample.throwException(13);
        sample.throwsException(13);
    }
    public void throwException(int number){
        try{
            if(number>12){
                throw new Exception("Number is over than 12");
            }
            System.out.println("Number is "+number);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void throwsException(int number) throws ArrayIndexOutOfBoundsException,NullPointerException,Exception{
        if(number>12){

            throw new Exception("Number is over than 12");

        }
        System.out.println("Number is "+number);
    }
}
