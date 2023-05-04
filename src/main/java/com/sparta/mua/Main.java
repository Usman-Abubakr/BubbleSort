package com.sparta.mua;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {56, 33, 6, 3, 36, 65};
        printArray(array);

        bubbleSort(array);
//        bubbleSort2(array);
        printArray(array);
    }


    static int[] bubbleSort(int[] array) {
        int length = array.length;
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                swapIfGreater(array, j);
            }
        }
        return array;
    }

    private static void swapIfGreater(int[] array, int j) {
        int temp;
        if (array[j - 1] > array[j]) {
            temp = array[j - 1];
            array[j - 1] = array[j];
            array[j] = temp;
        }
    }


    static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }




//    static int[] bubbleSort2(int[] array) {
//        int length = array.length;
//        firstForLoop(array, length);
//        return array;
//    }
//
//    private static void firstForLoop(int[] array, int length) {
//        for (int i = 0; i < length; i++) {
//            secondForLoop(array, length, i);
//        }
//    }
//
//    private static void secondForLoop(int[] array, int length, int i) {
//        for (int j = 1; j < (length - i); j++) {
//            swapElement(array, j);
//        }
//    }
//
//    private static void swapElement(int[] array, int j) {
//        int temp;
//        if (array[j - 1] > array[j]) {
//            temp = array[j - 1];
//            array[j - 1] = array[j];
//            array[j] = temp;
//        }
//    }
}