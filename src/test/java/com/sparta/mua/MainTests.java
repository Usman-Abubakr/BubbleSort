package com.sparta.mua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTests {

    @Test
    @DisplayName("check that [56, 33, 6, 3, 36, 65] return [3, 6, 33, 36, 56, 65]")
    void checkCorrectlySorted() {
        int[] array = {56, 33, 6, 3, 36, 65};
        int[] sortedArray = {3, 6, 33, 36, 56, 65};
        Assertions.assertArrayEquals(sortedArray, Main.bubbleSort(array));
//        Assertions.assertArrayEquals(sortedArray, Main.bubbleSort2(array));
    }
}
