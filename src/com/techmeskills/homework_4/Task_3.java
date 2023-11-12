package com.techmeskills.homework_4;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] num1 = {5, 35, 66, 22, 72};
        System.out.println(Arrays.toString(num1));
        int[] num2 = {5, 3, 15, 34, 55};
        System.out.println(Arrays.toString(num2));
        double avarege1 = 0;
        if (num1.length > 0) {
            double sum1 = 0;
            for (int i = 0; i < num1.length; i++) {
                sum1 += num1[i];
            }
            avarege1 = sum1 / num1.length;
            System.out.println("Average value the first array = "+avarege1);
        }
        double averege2 = 0;
        if (num2.length > 0) {
            double sum2 = 0;
            for (int j = 0; j < num2.length; j++) {
                sum2+=num2[j];
            }
            averege2 = sum2 / num2.length;
            System.out.println("Average value the second array = "+averege2);
        }
        if (avarege1 > averege2) {
            System.out.println("Average value the firs bigger than the second");
        } else if (avarege1 < averege2){
            System.out.println("Average value the second bigger than the first");
        } else if (avarege1 == averege2) {
            System.out.println("Their value are equal");
        }
    }
}
