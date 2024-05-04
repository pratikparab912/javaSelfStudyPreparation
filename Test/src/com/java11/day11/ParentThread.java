package com.java11.day11;

public class ParentThread extends Thread {
    private JointAccount account;
    public ParentThread(JointAccount account){
        this.account = account;
    }
    public void run(){
        setName("ParentThread");
        account.withdraw(3000);
    }
}
