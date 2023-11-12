package com.techmeskills.homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = {10, 15, 20, 20, 30, 10, 15, 30, 20};
        System.out.println(Arrays.toString(array));
        System.out.println("Input deleted element of array");
//        input value which need to delete
        Scanner sc = new Scanner(System.in);
        int delNumb = sc.nextInt();
//        reading input value
        int countNumb = 0;
        for (int i : array) {
            if (i == delNumb) {
                countNumb++;
            }
        }
        int finArray = array.length - countNumb;
        int[] array1 = new int[finArray];
//        объявляем счетчик
        int j = 0;
        for (int i=0;i<array.length;i++) {
            if (array[i] != delNumb) {
                array1[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}