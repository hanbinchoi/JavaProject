package com.company;

import java.nio.charset.StandardCharsets;

public class StringSample {
    public static void main(String[] args){
        StringSample sample = new StringSample();
        sample.checkMatch();
    }
    public void printByteArray(byte[] array){
        for(byte data:array){
            System.out.print(data+" ");
        }
        System.out.println();
    }

    public void convertUTF16() {
        try {
            String korean = "한글";
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);
            String korean2 = new String(array1,"UTF-16");
            System.out.println(korean2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void checkCompare(){
        String text = "abc";
        String text2 = "abc";

        if(text==text2){
            System.out.println(true);
        }
        text = "asd";
        System.out.println(text2);
    }

    public void checkCompareTo() {
        String text ="a";
        String text2 ="b";
        String text3 ="c";

        System.out.println(text2.compareTo(text));
        System.out.println(text2.compareTo(text3));
        System.out.println(text.compareTo(text3));

    }

    public void checkMatch(){
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";
        byte b=123;
        String byte1=String.valueOf(b);
        System.out.println(byte1);
        String[] textArray = text.split(" ",3);
        for(String tmp: textArray){
            System.out.println(tmp);
        }
        System.out.println(text.regionMatches(2,compare1,0,1)); //매개변수가 4개인 메소드
        System.out.println(text.regionMatches(5,compare1,0,2)); //매개변수가 4개인 메소드
        System.out.println(text.regionMatches(true, 0,compare2,0,4)); //매개변수가 5개인 메소드

    }
}
