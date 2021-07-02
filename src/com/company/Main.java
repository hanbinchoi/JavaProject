package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        String[] strList = list.toArray(new String[1]);
        System.out.println(strList[0]);
    }
}
