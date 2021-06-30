package com.codeit.ex2;

import java.util.ArrayList;

public class Main {
//    public static int getSurvivingIndex(int n, int k) {
//        // 코드를 입력하세요.
//        ArrayList<Integer> person = new ArrayList<>();
//        int i =1;
//        while(i<=20){
//            person.add(i);
//            i++;
//        }
//        int killIndex = 0;
//        while(person.size()!=1){
//
//            killIndex += 4;
//            if(killIndex>=person.size()){
//                killIndex=killIndex-person.size();
//            }
//            System.out.println(person.get(killIndex)+"번 군사가 죽습니다.");
//            person.remove(killIndex);
//            if (killIndex>=person.size()-4)
//            {
//                killIndex=killIndex-person.size();
//            }
//        }
//        return person.get(0);
//    }

    public static void main(String[] args) {
        PokeBag pokeBag = new PokeBag();

        pokeBag.add(new Pokemon("마그마", 1024));
        pokeBag.add(new Pokemon("마그마그", 215));
        pokeBag.add(new Pokemon("마릴", 816));
        pokeBag.add(new Pokemon("마그마그", 136));
        pokeBag.add(new Pokemon("라프라스", 1822));
        pokeBag.add(new Pokemon("마릴", 215));
        pokeBag.add(new Pokemon("마릴", 185));
        pokeBag.add(new Pokemon("마릴", 110));
        pokeBag.add(new Pokemon("니드킹", 1709));
        pokeBag.add(new Pokemon("마릴", 39));
        pokeBag.add(new Pokemon("마자용", 12));

        System.out.println(pokeBag.getStrongest("마릴"));
        System.out.println(pokeBag.getStrongest());
        System.out.println(pokeBag.getStrongest("피카츄"));
    }
}