package com.company;

public class InterestManager {

    public double getInterestRate(int day){
        if(day<=90){
            return 0.005;
        }
        else if(91<=day && day<=180){
            return 0.01;
        }
        else if(181<=day && day<=364){
            return 0.02;
        }
        else{
            return 0.056;
        }


    }

    public double calculateAmount(int day, long amoung){
        return 0;
    }


    public static void main(String[] args){
        InterestManager manager = new InterestManager();
        int a = true ? 1:2;
        System.out.println(a);
        for(int i=1;i<=365;i++){
            if(i%10==0)
                System.out.println(i+"day: "+1000000*manager.getInterestRate(i));
        }
    }
}
