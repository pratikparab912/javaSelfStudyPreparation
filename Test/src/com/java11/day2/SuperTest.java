package com.java11.day2;

public class SuperTest {
    public static void main(String[] args) {
        Super obj = new Super();
        obj.displayOne();

        Super.sub newObj = new Super.sub();
        newObj.showOne();

    }
}
