package com.java11.day11;

public class MyThreadNum extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 25; i++) {
                System.out.println(i);
                sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
