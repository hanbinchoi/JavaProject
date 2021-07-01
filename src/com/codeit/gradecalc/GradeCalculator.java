package com.codeit.gradecalc;

import java.util.ArrayList;
import java.util.HashMap;

public class GradeCalculator {
    private String name;
    private double grade;
    private  int creditNum;
    private ArrayList<Course> gradeList = new ArrayList<>();
    public GradeCalculator(String name, double grade, int creditNum){
        this.name = name;
        this.grade = grade;
        this.creditNum = creditNum;
        gradeList.add(new Course("이전 총합",creditNum,grade));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(int creditNum) {
        this.creditNum = creditNum;
    }

    public void addCourse(Course course){
        gradeList.add(course);
    }

    public void print(){
        System.out.println("직전 학기 성적: "+gradeList.get(0).getGrade()+" (총 "+gradeList.get(0).getCredit()+"학점)");
        double grade_sum = 0;
        int credit_sum = 0;
        for(Course data: gradeList){
            grade_sum += data.getGrade()*data.getCredit();
            credit_sum += data.getCredit();
        }
        double pScore = (grade_sum-(gradeList.get(0).getGrade()*gradeList.get(0).getCredit()))/(credit_sum-gradeList.get(0).getCredit());
        String pScoreStr = String.format("%.10f",pScore);
        double aScore = +grade_sum/credit_sum;
        String aScoreStr = String.format("%.10f",aScore);

        System.out.println("이번 학기 성적: "+pScoreStr+" (총 "+(credit_sum-gradeList.get(0).getCredit())+"학점)");
        System.out.println("전체 예상 성적: "+aScoreStr+" (총 "+credit_sum+"학점)");

    }
}
