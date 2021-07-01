package com.codeit.gradecalc;

public class Course {
    public static final int CREDIT_MAJOR = 3;
    public static final int CREDIT_GENERAL = 2;

    private String name;
    private int credit;
    private double  grade;

    public Course(String name, int credit, String grade){
        this.name = name;
        this.credit = credit;
        switch (grade){
            case "A+":
                this.grade=4.5;
                break;
            case "A":
                this.grade=4;
                break;
            case "B+":
                this.grade=3.5;
                break;
            case "B":
                this.grade=3;
                break;
            case "C+":
                this.grade=2.5;
                break;
            case "C":
                this.grade=2;
                break;
            case "D+":
                this.grade=1.5;
                break;
            case "D":
                this.grade=1;
                break;
            case "F":
                this.grade=0;
                break;

        }
    }

    public Course(String name, int credit, double grade) {
        this.name = name;
        this.credit = credit;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setGrade(String grade) {
        switch (grade) {
            case "A+":
                this.grade = 4.5;
                break;
            case "A":
                this.grade = 4;
                break;
            case "B+":
                this.grade = 3.5;
                break;
            case "B":
                this.grade = 3;
                break;
            case "C+":
                this.grade = 2.5;
                break;
            case "C":
                this.grade = 2;
                break;
            case "D+":
                this.grade = 1.5;
                break;
            case "D":
                this.grade = 1;
                break;
            case "F":
                this.grade = 0;
                break;
        }
    }
}
