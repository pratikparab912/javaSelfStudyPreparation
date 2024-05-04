package com.company;

import java.util.Scanner;

class TeacherException extends Exception {
    public TeacherException(String invalid_age) {
        super(invalid_age);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter age : ");
            int age = scanner.nextInt();
            if (age < 18)
                throw new TeacherException("Invalid Age");
            else
                System.out.println("Valid Age");
        } catch(TeacherException e){
            System.out.println("Caught an Exception. " +e.getMessage());
        }

    }

}

