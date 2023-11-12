package com.techmeskills.homework_4;

import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25, 30};
        System.out.println("Input your number of array");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean found = true; // задал
        for (int i : array) {
            if (i == number) {
                found = false;
                System.out.println("This number is in array");
                break;
            }
        }
        if (found)
            System.out.println("This number isn't in array");
    }
}
