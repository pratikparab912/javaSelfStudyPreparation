package com.java11.day11;

public class TestAccount {
    public static void main(String[] args) {
        JointAccount account = new JointAccount(10000);
        ParentThread parentThread = new ParentThread(account);
        ChildThread childThread = new ChildThread(account);

        parentThread.start();
        childThread.start();
    }
}
