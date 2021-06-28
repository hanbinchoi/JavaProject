package com.codeit.ex;

public class BankAccount {
    private int balance;
    private Person owner;

    public BankAccount(int pBalance) {
        if (pBalance<0) pBalance=0;
        else balance = pBalance;
    }

    public BankAccount(Person pOwner) {
        owner=pOwner;
        balance=0;
    }

    public BankAccount(int pBalance, Person pOwner) {
        if (pBalance<0) pBalance=0;
        else balance = pBalance;
        owner=pOwner;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }

    public void setOwner(Person person){
        this.owner=person;
    }
    public Person getOwner(){
        return owner;
    }

    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean deposit(int amount) {
        // 1. write code here
        if (amount < 0) {
            System.out.println("입금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCash()+"원");
            return false;
        }
        else if (owner.getCash() < amount){
            System.out.println("입금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCash()+"원");
            return false;
        }
        else{
            balance += amount;
            owner.setCashAmount(owner.getCash() - amount);
            System.out.println(amount+"원 입금하였습니다. 잔고: "+balance+"원, 현금: "+owner.getCash()+"원");
            return true;
        }
    }

    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean withdraw(int amount) {
        // 2. write code here
        if (amount > balance){
            System.out.println("출금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCash()+"원");
            return false;
        }
        else if (amount < 0) {
            System.out.println("출금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCash()+"원");
            return false;
        }
        else{
            balance -= amount;
            owner.setCashAmount(owner.getCash() + amount);
            System.out.println(amount+"원 출금하였습니다. 잔고: "+balance+"원, 현금: "+owner.getCash()+"원");
            return true;
        }
    }

    // account와 account 간의 거래이므로, Person to의 정보를 to의 account 정보로 바꾸어 호출.
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        boolean success;

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.balance += amount;
            success = true;
        }

        System.out.println(success + " - from: " + owner.getName()
                + ", to: " + to.owner.getName()
                + ", amount: " + amount
                + ", balance: " + balance);

        return success;
    }
}