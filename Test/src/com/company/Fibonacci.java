package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Count : ");
        int count = scanner.nextInt();

        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " +n2);
        // int count = 10;
        for(int i = 0; i <= count -1 ; i++) {
            n3 = n1 + n2;
            System.out.print(" " +n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
