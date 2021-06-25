package com.company;

public class ManageStudent {
    public static void main(String[] args){
        Student[] student = new Student[3];
        ManageStudent manager = new ManageStudent();
        student = manager.addStudent();
//        manager.printStudents(student);
        manager.checkEquals();
        System.out.println(manager.getClass());
    }
    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook","Seoul","010xxxxxxxx","ask@godofjava.com");
        return student;

    }

    public void printStudents(Student[] student){
        for(Student data:student)
            System.out.println(data.toString());
    }

    public void checkEquals(){
        Student a = new Student("Min","Seoul","010xxxxxxxx","ask@godofjava.com");
        Student b = new Student("Min","Seoul","010xxxxxxxx","ask@godofjava.com");

        if(a.equals(b)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
