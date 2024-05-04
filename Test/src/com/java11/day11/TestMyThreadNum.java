package com.java11.day11;

public class TestMyThreadNum {
    public static void main(String[] args) {
        MyThreadNum myThreadNum = new MyThreadNum();
        Thread thread = new Thread(myThreadNum);
        thread.start();
    }
}
