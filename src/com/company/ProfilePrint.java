package com.company;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte age){
        this.age = age;
    }
    public byte getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean flag) {
        isMarried = flag;
    }

    public static void main(String args[]){
        ProfilePrint profile1 = new ProfilePrint();
        profile1.setAge((byte)(20));
        profile1.setMarried(true);
        profile1.setName("Alex");
        System.out.println(profile1.getAge());
        System.out.println(profile1.getName());
        System.out.println(profile1.isMarried());

    }
}
