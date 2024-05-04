package com.company;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter age : ");
            int age = scanner.nextInt();

            if(age < 18)
                throw new StudentAgeException("Invalid Age, You are not eligible to vote!");
            else
                System.out.println("Valid Age, Welcome to vote!");
        } catch (StudentAgeException e) {
            System.out.println("Caught an exception : " +e.getMessage());
        }
    }
}
