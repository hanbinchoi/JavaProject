package com.codeit.ex2;

public class ShapePrinter {
    public void printTriangle(int height){
        for(int i=0;i<height;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPyramid(int height) {
        // 코드를 입력하세요.
        for(int i=0;i<height;i++){
            for(int j=0;j<height;j++){
                if(j<(height-1-i)) System.out.print(" ");
                else System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printFloydsPyramid(int height) {
        // 코드를 입력하세요.
        int max = height *(height+1) / 2;
        String strMax = String.valueOf(max);
        int enter = 0;
        int count = 1;
        for(int i=1;i<=max;i++){
            if(enter==count){
                count++;
                enter=0;
                System.out.println();
            }
            String str = String.valueOf(i);
            if (str.length()==strMax.length()) System.out.print(str+" ");
            else{
                for(int j=0;j<strMax.length()-str.length();j++)
                    str = " "+str;
                System.out.print(str+" ");
            }
            enter++;
        }
        System.out.println();
    }
}
