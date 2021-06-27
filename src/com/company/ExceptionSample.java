package com.company;

public class ExceptionSample {
    public static void main(String[] args){
        ExceptionSample sample = new ExceptionSample();
        sample.finallySample();
    }
    public void finallySample(){
        int[] intAraay = new int[5];
        try {
            intAraay=null;
            System.out.println(intAraay[5]);
        }
        catch (NullPointerException e){
            System.out.println("NullPointerExcepton occured");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException e");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("This code must run");
    }

}
