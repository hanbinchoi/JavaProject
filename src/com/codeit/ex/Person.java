package com.codeit.ex;
public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String pName, int pAge){
        name=pName;
        if (pAge<0){
            age=12;
        }
        else age=pAge;
        cashAmount=0;
    }
    public Person(String pName, int pAge, int pCashAmount){
        name=pName;
        if (pAge<0){
            age=12;
        }
        else age=pAge;
        if(pCashAmount<0) cashAmount=0;
        else cashAmount=pCashAmount;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setCashAmount(int cashAmount){
        this.cashAmount=cashAmount;
    }
    public int getCash(){
        return cashAmount;
    }

    public void setAccount(BankAccount account){
        this.account=account;
    }
    public BankAccount getAccount(){
        return account;
    }

    // account와 account 간의 거래이므로, 첫째로 BankAccount 클래스의 transfer 메소드를 써야함.
    // 둘째로 Person to의 정보를 to의 account 정보로 바꾸어 호출.
    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

    // account와 account 간의 거래이므로, BankAccount 클래스의 transfer 메소드를 써야함.
    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
}