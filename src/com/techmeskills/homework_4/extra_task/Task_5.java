package com.techmeskills.homework_4.extra_task;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array");
        // to set up size of array via console
        int size = sc.nextInt();
        int[] array = new int[size];
        // to fil in array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        //  to find out elements of array with odd index
        System.out.println(Arrays.toString(array));
        for (int i : array) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
