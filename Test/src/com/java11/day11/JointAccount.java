package com.java11.day11;

public class JointAccount {
    private double balance;
    public JointAccount(double balance){
        this.balance = balance;
    }
    synchronized public void withdraw(double amount){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Balnce before = "+balance);
        if(amount <= balance)
            balance = balance-amount;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.class.getName());
        System.out.println("Balance after ="+balance);

    }
}
