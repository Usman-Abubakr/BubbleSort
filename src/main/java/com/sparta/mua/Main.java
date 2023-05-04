package com.sparta.mua;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int array[] = {56, 33, 6, 3, 36, 65,};

        printArray(array);

        bubbleSort(array);
        printArray(array);

    }


    static void bubbleSort(int[] array) {
        int length = array.length;
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    static void printArray(int array[]) {
        System.out.println(Arrays.toString(array));
    }
}