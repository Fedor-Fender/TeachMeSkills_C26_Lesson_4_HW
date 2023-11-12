package com.techmeskills.homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input lenght of massive !");
        int length = sc.nextInt();
        int array[] = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));//[-10:10]
        }
        System.out.println("We get massive " + Arrays.toString(array));
//        int min=array[0];
//        for (int i = 0; i < ; i++) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Output meaning of min_elemen_massive =" + min);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Output meaning max_element_massive =" + max);
        double average = (double)(max+min)/2;
        System.out.println("Output avarege meaning = " + average);
    }
}
