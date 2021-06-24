package com.company;

public class ManageHeight {
    int [][] gradeHeights;
    public static void main(String[] args){
        ManageHeight magager = new ManageHeight();
        magager.setData();
        magager.printAverage(1);
        magager.printAverage(2);
        magager.printAverage(3);
        magager.printAverage(4);
        magager.printAverage(5);

    }
    public void setData(){

        gradeHeights = new int[][]{{170,180,173,175,177},{160,165,167,186},{158,177,187,176},{173,182,181},{170,180,165,177,172}};
    }
    public void printHeight(int classNo){
        System.out.println(classNo+"반");
        for(int data:gradeHeights[classNo-1]){
            System.out.print(data+" ");
        }
        System.out.println();
    }

    public void printAverage(int classNo){
        double avg,sum=0;
        for(int data:gradeHeights[classNo-1]){
            sum += data;
        }
        avg = sum/gradeHeights[classNo-1].length;
        System.out.println(classNo+"반 평균: "+avg);
    }
}
