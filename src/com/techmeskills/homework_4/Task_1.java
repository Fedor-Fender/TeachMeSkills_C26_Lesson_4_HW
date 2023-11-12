package com.techmeskills.homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25, 30};
        System.out.println("Input your number that you want to delete");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean valueDel = false; //логический счетчик
        for (int i : array) {
            if (i == number) {
                valueDel = true;
                System.out.println("this number is exsists");
                break;
            }
        }
        if (valueDel) {
            int a = 0;
            for (int i : array) {
                if (i!=number)
                    a = i;
            }
            int[] array1 = new int[a];

//            i don't know how to write code
        }
    }
}